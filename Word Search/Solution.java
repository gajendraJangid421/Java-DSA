class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here
        int[][] visited = new int[board.length][board[0].length];
        int index = 0;
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean ans = solution(board, i, j, word, visited, index);
                    
                    if(ans){
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    public boolean solution(char[][] board, int i, int j, String word, int[][] visited, int index){
        if(index==word.length()-1){
            return true;
        }
        
        visited[i][j] = 1;
        index++;
        boolean ans = false;
        
        if(i>0  && 
           visited[i-1][j]!=1 && board[i-1][j]==word.charAt(index)){
               ans = solution(board, i-1, j, word, visited, index);
               return ans;
        }
        else if(j>0 &&
           visited[i][j-1]!=1 && board[i][j-1]==word.charAt(index)){
               ans = solution(board, i, j-1, word, visited, index);
               return ans;
        }
        else if( j<board[0].length-1 && 
           visited[i][j+1]!=1 && board[i][j+1]==word.charAt(index)){
               ans = solution(board, i, j+1, word, visited, index);
               return ans;
        }
        else if( i<board.length-1 && 
           visited[i+1][j]!=1 && board[i+1][j]==word.charAt(index)){
               ans = solution(board, i+1, j, word, visited, index);
               return ans;
        }
        else{
            return false;
        }
    }
}
