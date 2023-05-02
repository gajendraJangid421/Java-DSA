class Solution {
    public static boolean makePalindrome(int n, String[] arr) {
        // code here
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<n;i++){
            sb.append(arr[i]);
        }
        
        for(int i=0;i<n;i++){
            if(sb.length()==0){
                break;
            }
            
            StringBuilder sbReverse = new StringBuilder(arr[i]).reverse();
            int index = sb.indexOf(arr[i]);
            
            if(index==-1){
                continue;
            }
            sb.delete(index, index + arr[i].length());
            
            if(sbReverse.toString().equals(arr[i])){
                continue;
            }else{
                int index2 = sb.indexOf(sbReverse.toString());
                
                if(index2==-1){
                    return false;
                }else{
                    sb.delete(index2, index2 + arr[i].length());
                }
            }
        }
        
        return true;
    }
}
