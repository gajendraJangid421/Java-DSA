class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        al.add(arr[n-1]);
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=al.get(al.size()-1)){
                al.add(arr[i]);
            }
        }
        
        Collections.reverse(al);
        
        return al;
    }
}
