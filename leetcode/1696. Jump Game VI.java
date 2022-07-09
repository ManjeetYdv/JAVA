// TLE ,then optimized use heap

class Solution {
    
    public int maxAmong(int[]sum , int start , int end){
        int max= sum[start];
        for(int i=start+1;i<=end ;i++){
            max= Integer.max(max , sum[i]);
        }
        return max;
    }
    
    public int maxResult(int[] arr, int k) {
        
        int[]sum = new int[arr.length];
        sum[0]=arr[0];

        int starting=0;
        int ending=0;
        for(int i=1 ;i<arr.length ;i++){

            if(i<=k){
                starting=0;
                ending=i-1;
            }
            else{
                starting=i-k;
                ending=i-1;
            }
            sum[i]=arr[i] + maxAmong(sum , starting , ending);
        }

        return sum[sum.length-1];
        
        
    }
}

//optimized

class Solution {
    
   
    
    public int maxResult(int[] arr, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a , b)->b[1]-a[1]);
        
        int max=arr[0];
        pq.add(new int[]{0 ,max});
        
        for(int i=1 ;i<arr.length ;i++){
            
            while(i-pq.peek()[0]>k){
                pq.poll();
            }
            
            int[]top = pq.peek();
            max =arr[i]+top[1];
            
            pq.add(new int[]{i ,max});
            
        }
        
        return max;
        
        
    }
}
