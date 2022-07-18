class Solution {
    
    
    public int sumDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
    
    
    
    
    
    
    public int maximumSum(int[] arr) {
        
       int[] map = new int[82];
        int result = -1;

        for (int item : arr) {
            int key = sumDigits(item);

            if (map[key]!= 0){
                result = Math.max(result, map[key] + item);
            }
            
            map[key] = Math.max(map[key], item);
            
        }

        return result;
        
        
    }
}
