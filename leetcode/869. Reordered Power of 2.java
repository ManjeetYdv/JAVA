class Solution {
    public boolean reorderedPowerOf2(int n) {

        Set<String> set = new HashSet<>();
        for(int i=0 ;i<30 ;i++){
            
            int powOfTwo = power2(i);
            String sortedPow = sortCharArray(powOfTwo);
            set.add(sortedPow);
        }
        
        String givenPower  = sortCharArray(n);
        if(set.contains(givenPower)) return true;
        else return false;


    }

    private int power2(int n){
        if(n==0) return 1;

        int res=1;
        for(int i=1 ;i<=n ;i++) res*=2;
        return res;
    }
    
     private String sortCharArray(int powerof2){

        String power = Integer.toString(powerof2);
        char[] chars = power.toCharArray();
        Arrays.sort(chars);
        return new String(chars);

    }
}
