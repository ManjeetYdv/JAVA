class Solution {
    
    public boolean isValid(char[][] board , int row , int col){
        
        
        Character curr = board[row][col];
        
        board[row][col]='.';
        
        for(int i=0 ;i<9 ;i++){
            
            if(board[i][col]==curr){
                board[row][col]= curr;
                return false;
            }
            
            if(board[row][i]==curr){
                board[row][col]= curr;
                return false;
            }
            
        
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == curr ){
                  board[row][col]= curr;
                  return false;
            } 
        }
        
        return true;
        
    }
    
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0 ;i<board.length ;i++){
            for(int j=0 ;j<board[0].length ;j++){
                
                if(board[i][j]=='.') continue;
                if(!isValid(board , i , j)) return false;
            }
        }
        
        return true;
        
    }
}
