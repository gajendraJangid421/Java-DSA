class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        // Your code here
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        int count = Integer.MAX_VALUE, ans = 0;
        
        for(int i=0;i<n;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1); 
        }
        
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            if(ans<=entry.getKey() && count>=entry.getValue()){
                ans = entry.getKey();
                count = entry.getValue();
            }
        }
        
        return ans;
    }
}
