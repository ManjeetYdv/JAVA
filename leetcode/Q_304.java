class NumMatrix {
    
   final int prefix[][];
    
    public NumMatrix(int[][] matrix) {
        
    this.prefix = new int[matrix.length +1][matrix[0].length +1];
        for(int i =0; i < matrix.length; i++) {
            int rowSum =0;
            for(int j =0; j < matrix[0].length; j++) {
                rowSum += matrix[i][j];
                prefix[i+1][j+1] = rowSum;
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        int rangesum=0;
        for(int i=row1+1 ;i<=row2+1 ;i++){
            rangesum = rangesum + prefix[i][col2+1] - prefix[i][col1];
        }
        return rangesum;
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 
 in brute force you can get the resulst in O(n^2) for each sumregion calculations. We can avoid O(n^2) for each calculations by only perform on O(n^2) when we create a prefix array, O(n) for each sumregion calculation.

1- Create a prefix array with one extra empty row at index 0 and one empty column at index0 so you can avoid edge cases.
2- loop through each row (from row1 +1 to row2+1 since we have an extra row)
3- get the sum of each row at given columns (column2 +1 - the prefix sum of the given column + 1 -1))

this will avoid O(n^2) time complexity in calculating sumregion and gets the result in O(n);
 */
