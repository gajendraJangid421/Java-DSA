class Solution {
    public static int findMoves(int n, int[] chairs, int[] passengers) {
        // code here
        int ans = 0;
        
        Arrays.sort(chairs);
        Arrays.sort(passengers);
        
        for(int i=0;i<n;i++){
            ans += Math.abs(chairs[i]-passengers[i]);
        }
        
        return ans;
    }
}
