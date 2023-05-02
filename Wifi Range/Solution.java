class Solution 
{ 
    boolean wifiRange(int N, String S, int X) 
    { 
        // code here
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='1'){
                continue;
            }
            
            int left = i-X, right = i+X;
            
            if(left<0){
                left = 0;
            }
            if(right>=N){
                right = N-1;
            }
            
            String text = S.substring(left, right+1);
            
            if(!text.contains("1")){
                return false;
            }
        }
        
        return true;
    }
} 
