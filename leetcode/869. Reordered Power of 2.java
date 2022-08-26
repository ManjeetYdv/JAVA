class Solution {
    public boolean reorderedPowerOf2(int n) {
        
       Set<Integer> set = new HashSet<>();
        for(int i=0 ;i<30 ;i++){
            set.add(powerOfTwo(i));
        }

        List<Integer> ls = new ArrayList<>();
        while(n>0){
            ls.add(n%10);
            n/=10;
        }
        ls.sort((a , b)->b-a);

        int num = 0;
        
        for(int i : ls){
            num = num*10 +i;
        }

        return set.contains(num);
    }
    
    
      public int powerOfTwo(int n){

        List<Integer> list = new ArrayList<>();

        int res = 1;

        for(int i=1 ;i<=n ;i++){
            res*=2;
        }

        while(res>0){
            list.add(res%10);
            res/=10;
        }

        list.sort((a,b)->b-a);

        int num = 0;
          
        for(int i :list){
            num = num*10 + i;
        }

        return num;

    }
}
