class Solution {
    public static int totalCuts(int N, int K, int[] A) {
        // code here
        if(N==1){
            return 0;
        }
        
        ArrayDeque<Integer> rightMinArray = new ArrayDeque<>();
        int min = A[N-1], max = A[0], ans = 0;
        
        for(int i=N-1;i>0;i--){
            if(min>A[i]){
                min = A[i];
            }
            
            rightMinArray.push(min);
        }
        
        for(int i=1;i<N;i++){
            if(min+max>=K){
                ans++;
            }
            
            if(max<A[i]){
                max = A[i];
            }
            
            rightMinArray.pop();
            
            if(rightMinArray.size()!=0)
                min = rightMinArray.peek();
        }
        
        return ans;
    }
}

/*
brute force - got TLE
class Solution {
    public static int totalCuts(int N, int K, int[] A) {
        // code here
        if(N==1){
            return 0;
        }
        
        // ArrayDeque<Integer> stack = new ArrayDeque<>(), temp = new ArrayDeque<>();
        
        // for(int i=1;i<N;i++){
           
        //     while(stack.size()!=0 && A[i]>stack.peek()){
        //         temp.push(stack.pop());
        //     }
            
        //     stack.push(A[i]);
            
        //     while(temp.size()!=0){
        //         stack.push(temp.pop());
        //     }
        // }
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=1;i<N;i++){
            al.add(A[i]);
        }
        Collections.sort(al);
        
        int max = A[0], min = al.get(0), ans = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int i=1;i<N;i++){
            if(max+min>=K){
                ans++;
            }
            
            if(max<A[i]){
                max = A[i];
            }
            
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
            
            int count = 0;
            if(al.size()!=0 && hm.containsKey(al.get(0)))
                count = hm.get(al.get(0));
                
            while(count>0 && hm.containsKey(al.get(0))){
                al.remove(0);
                
                count--;
            }
            
            if(al.size()!=0)
                min = al.get(0);
        }
        
        return ans;
    }
}
*/
