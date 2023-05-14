class Solution {
    public static int arrayOperations(int n, int[] arr) {
        // code here
        int ans = 0, flag = 0;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                flag = 1;
                break;
            }
        }
        
        if(flag == 0){
            return -1;
        }
        
        int nonZero = 0;
        
        for(int i=0;i<n;i++){
            if(arr[i]!=0 && nonZero==0){
                nonZero = 1;
            }
            
            if(arr[i]==0 && nonZero==1){
                nonZero = 0;
                ans++;
            }
        }
        
        if(nonZero==1){
            ans++;
        }
        
        return ans;
    }
}
