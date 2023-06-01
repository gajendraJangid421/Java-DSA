class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here 
        int index = 0, sum = 0, ans = Integer.MAX_VALUE, count = 0;
        
        for(int i=0;i<n;i++){
            sum += a[i];
            
            while(index<=i && sum>x){
                count = i - index + 1;
                
                if(ans>count){
                    ans = count;
                }
                
                if(ans==1) return 1;
                
                sum -= a[index];
                index++;
            }
            
        }
        
        if(index==0){
            return 0;
        }
        
        return ans;
    }
}
