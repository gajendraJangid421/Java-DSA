class Solution {
    public static String stringMirror(String str) {
        // code here
        int i = 0;
        
        while(i<str.length()-1){
            if(i==0 && str.charAt(i)==str.charAt(i+1)){
                break;
            }
            
            if(str.charAt(i)>=str.charAt(i+1)){
                i++;
            }else{
                break;
            }
        }
        
        if(str.length()==1 || i==0){
            return "" + str.charAt(0) + str.charAt(0);
        }
        
        StringBuilder sb = new StringBuilder(str.substring(0, i+1));
        StringBuilder sb1 = new StringBuilder(sb);
        
        sb.append(sb1.reverse());
        
        return sb.toString();
    }
}
