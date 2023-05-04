//User function Template for Java
class Solution{
    public static int maxCoins(int n,int ranges[][])
    {
        ArrayDeque<Integer> startStack = new ArrayDeque<>(), 
                            endStack = new ArrayDeque<>(), 
                            tempStack = new ArrayDeque<>();
        
        startStack.push(0);
        
        for(int i=1;i<n;i++){
            
            while(startStack.size()!=0 && ranges[startStack.peek()][0] >= ranges[i][0]){
                tempStack.push(startStack.pop());
            }
            
            startStack.push(i);
            
            while(tempStack.size()!=0){
                startStack.push(tempStack.pop());
            }
        }
        
        endStack.push(0);
        
        for(int i=1;i<n;i++){
            
            while(endStack.size()!=0 && ranges[endStack.peek()][1] < ranges[i][1]){
                tempStack.push(endStack.pop());
            }
            
            endStack.push(i);
            
            while(tempStack.size()!=0){
                endStack.push(tempStack.pop());
            }
        }
        
        // int maxCoins = 0, sumOfCoins = 0;
        
        // while(endStack.size()!=0){
        //     sumOfCoins = 0;
            
        //     int index = endStack.pop();
            
        //     while(startStack.size()!=0 && ranges[index][1] <= ranges[startStack.peek()][0]){
        //         if(index!=startStack.peek() && sumOfCoins < ranges[startStack.peek()][2]){
        //             sumOfCoins = ranges[startStack.peek()][2];
        //         }
                
        //         tempStack.push(startStack.pop());
        //     }
            
        //     while(tempStack.size()!=0){
        //         startStack.push(tempStack.pop());
        //     }
            
        //     if(maxCoins < ranges[index][2] + sumOfCoins){
        //         maxCoins = ranges[index][2] + sumOfCoins;
        //     }
        // }
        // 
        // return maxCoins;
        
        
        //converting startStack to arraylist to decrese pop of startStack to push in tempStack 
        //and vise versa
        ArrayList<Integer> al = new ArrayList<>();
        
        while(startStack.size()!=0){
            al.add(startStack.pop());
        }
        
        int maxCoins = 0, sumOfCoins = 0, idx = 0;
        
        while(endStack.size()!=0){
            sumOfCoins = 0;
            idx = 0;
            
            int index = endStack.pop();
            
            while(al.size()!=idx && ranges[index][1] <= ranges[al.get(idx)][0]){
                if(index!=al.get(idx) && sumOfCoins < ranges[al.get(idx)][2]){
                    sumOfCoins = ranges[al.get(idx)][2];
                }
                
                idx++;
            }
            
            if(maxCoins < ranges[index][2] + sumOfCoins){
                maxCoins = ranges[index][2] + sumOfCoins;
            }
        }
        
        return maxCoins;
    }
}
