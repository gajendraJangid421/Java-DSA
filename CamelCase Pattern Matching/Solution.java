class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        //code here
        ArrayList<String> al = new ArrayList<>();
        
        for(int i=0;i<N;i++){
            int index = 0;
            
            for(int j=0;j<Dictionary[i].length();j++){
                if(Dictionary[i].charAt(j)>=65 && Dictionary[i].charAt(j)<=91){
                    if(Dictionary[i].charAt(j)==Pattern.charAt(index)){
                        index++;
                    }else{
                        break;
                    }
                    
                    if(index==Pattern.length()){
                        al.add(Dictionary[i]);
                        break;
                    }
                }
            }
        }
        
        if(al.size()==0){
            al.add("-1");
            return al;
        }
        
        Collections.sort(al);
        
        return al;
    }
}
