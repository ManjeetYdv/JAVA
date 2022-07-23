class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for( int  i : deck){
            map.put(i , map.getOrDefault(i ,0)+1);
            
        }
        
        int res=0;
        
        for(int key :  map.keySet()){
            
            res = gcd(res , map.get(key));
        }
        
        return res<2 ? false:true;
      
        
    }
    
      public int gcd(int a, int b){
        if(b==0){
            return a ;
        }
        return gcd(b, a%b);
    }
}
