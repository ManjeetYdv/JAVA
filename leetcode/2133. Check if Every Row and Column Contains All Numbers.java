class Solution {
    public boolean checkValid(int[][] matrix) {
     
        int n= matrix.length;
        HashSet<Integer> set = new HashSet<>();
        
        //Row check
        for(int i=0 ;i<n; i++){
           
            for(int j=0 ;j<n; j++){
                
                if(matrix[i][j]>n || matrix[i][j]<1) return false;
                if(!set.add(matrix[i][j])) return false;
             }
            set.clear();
          }
        
        //Column check
        for(int i=0 ;i<n; i++){
           
            for(int j=0 ;j<n; j++){
                
                if(matrix[i][j]>n || matrix[i][j]<1) return false;
                if(!set.add(matrix[j][i])) return false;
             }
            set.clear();
          }
        
        return true;
    }
}
