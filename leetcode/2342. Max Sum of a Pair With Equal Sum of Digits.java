class Solution {
    
    
    public int sumDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
    
    
    
      public int max2Sum(List<Integer> list){

        int max=0;
        int max2=0;
        for(int i= 0; i<list.size() ;i++){

            if(list.get(i)>=max){
                max2 = max;
                max = list.get(i);
            }
            else if(list.get(i)>max2 && list.get(i)!=max){
                max2 = list.get(i);
            }
        }
           return max+max2;
      }
    
    
    
    
    public int maximumSum(int[] arr) {
        
        int max=0;
         for(int i=0 ;i<arr.length ;i++ ){
            max= Math.max(max , sumDigits(arr[i]));
        }
        
        List<List<Integer>> res= new ArrayList<>();
        for(int i=0 ;i<=max; i++){
            List<Integer> list = new ArrayList<>();
            res.add(list);
        }
        
        for(int i :arr){
            
            int pos = sumDigits(i);
            res.get(pos).add(i);
        }
        
        int maxSum=-1;
        for(int i=0 ;i<=max; i++){
            
            List<Integer> temp = res.get(i);
            if(temp.size()<=1) continue;
            
            maxSum = Integer.max(maxSum , max2Sum(temp) );
        }
        
        return maxSum;
        
    }
}
