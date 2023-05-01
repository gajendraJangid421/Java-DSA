
class Solution {
    public static int minimumNumber(int n, int[] arr) {
        // code here
        int ans = arr[0];
        
        for(int i=1;i<n;i++){
            do{
                if(ans==1 || arr[i]==1){
                    ans = 1;
                    break;
                }else if(ans==0 || arr[i]==0){
                    if(ans<arr[i]){
                        ans = arr[i];
                    }
                    break;
                }
                
                if(ans>=arr[i]){
                    ans %= arr[i];
                }else{
                    arr[i] = arr[i] % ans;
                }
                
                
            }while(ans!=1);
        }
        
        return ans;
    }
}
        
