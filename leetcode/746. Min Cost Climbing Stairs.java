class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        
//         List<Integer> list = new ArrayList<>();
         
//         list.add(0);
//         list.add(0);
    
//         int l;
//         for(int i=0 ;i<cost.length ;i++){
            
//            l= list.size();
//            int min = cost[i]+ Integer.min(list.get(l-2) ,list.get(l-1));
//            list.add(min);
        
//         }
        
//         l = list.size();
//         return Integer.min( list.get(l-1) , list.get(l-2));
        
        int prev1=0;
        int prev2=0;
        
        for(int i: cost){
            
                int temp=prev2;
                prev2 =i+Integer.min(prev1, prev2);
                prev1 =temp;
        }
        
        return Integer.min(prev1, prev2);
        
        
        
    }
}
