class Solution {
    public int countKDifference(int[] nums, int k) {
     
        Map<Integer,Integer> freq= new HashMap<Integer,Integer>();
        for(int val :nums){
            freq.put(val,freq.getOrDefault(val,0)+1);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            int value = nums[i]+k;
            count+=freq.getOrDefault(value,0);
        }
        return count;
        
    }
}
