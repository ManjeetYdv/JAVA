class Solution {
    public int findClosestNumber(int[] nums) {
        
        if(nums.length==1) return nums[0];
        
        int minDiff = Math.abs(nums[0]-0);
        int minValue = nums[0];
        
        for(int i=1 ;i<nums.length ;i++){
            int diff = Math.abs(nums[i]-0);
            
            if(diff<minDiff){
                minDiff=diff;
                minValue = nums[i];
            }
            if(diff==minDiff){
                minValue = Math.max(minValue, nums[i]);
            }
        }
        return minValue;
    }
}
