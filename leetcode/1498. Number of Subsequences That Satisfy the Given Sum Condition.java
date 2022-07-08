//TLE dedia bc  .... will optimize it later

class Solution {
    
   
    
    public int subK(int[]arr,  int index, int target , List<Integer>list ){
        
        if(index==arr.length){
            
            if(list.size()>0){
                
              int min= Collections.min(list);
              int max= Collections.max(list);
                
              if(min+max<=target){
                return 1;
              }
            }
            
         return 0;
        }

        list.add(arr[index]);
        int left = subK(arr, index+1 , target , list );
        list.remove(list.size()-1);

       int right = subK(arr , index+1 , target  , list);
        
        return (left+ right)%((int)Math.pow(10,9)+7 );
      }
     
    
    public int numSubseq(int[] nums, int target) {
        
      
        
        return subK(nums , 0 , target , new ArrayList<>());
        
        
    }
}
