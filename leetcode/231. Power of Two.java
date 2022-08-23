class Solution {
    public boolean isPowerOfTwo(int n) {
        
       if(n<1) return false;
    
        while(true){
            if(n==1 || n==2) return true;
            if(n%2!=0) return false;
            n/=2;
        }
    }
}
