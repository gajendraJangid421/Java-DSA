Problem Link: https://practice.geeksforgeeks.org/problems/d894706c496da5c5a4f45b0360c7f4164c516f83/1

//User function Template for Java
class Solution{
    public static int powerfullInteger(int n,int interval[][],int k)
    {
        // Brute force approach
        // HashMap<Integer, Integer> hm = new HashMap<>();
        
        // for(int i=0;i<n;i++){
        //     for(int j=interval[i][0];j<=interval[i][1];j++){
        //         hm.put(j, hm.getOrDefault(j, 0) + 1);
        //     }
        // }
        
        // int ans = -1;
        
        // for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
        //     if(entry.getValue()>=k && ans<entry.getKey()){
        //         ans = entry.getKey();
        //     }
            
        //     if(entry.getValue()==k && ans<entry.getKey()){
        //         ans = entry.getKey();
        //     }
        // }
        
        // return ans;
        
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0;i<n;i++){
            hm.put(interval[i][0], hm.getOrDefault(interval[i][0], 0) + 1);
            hm.put(interval[i][1]+1, hm.getOrDefault(interval[i][1]+1, 0) - 1);
        }
        
        TreeMap<Integer, Integer> tm = new TreeMap<>(hm);
        int ans = -1, sum = 0;
        boolean flag = false;
        
        for(Map.Entry<Integer, Integer> entry: tm.entrySet()){
            sum += entry.getValue();
            
            if(sum>=k){
                ans = entry.getKey();
                flag = true;
            }else if(flag==true){
                ans = entry.getKey() - 1;
                flag = false;
            }else{
                flag = false;
            }
        }
        
        return ans;
    }
}
