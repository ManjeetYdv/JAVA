class Solution {
    public String reverseStr(String s, int k) {
        
        //will optimize later
        
        if(k>=s.length()){
            return new StringBuilder(s).reverse().toString();
        }
        
        int count=0;             //TO keep count 
        String res="";           //Result string
        String word="";          //to store k characters
        boolean reverse=true;    //keeping reverse to reverse first k chars and not to reverse next k characters
        for(int i=0 ;i<s.length() ;i++){
          
            count++;
            word+=s.charAt(i);
            if(count==k){
                
                if(reverse==true) {
                    res += new StringBuilder(word).reverse().toString();
                    reverse = false;
                }
                else {
                    res+=word;
                    reverse=true;
                }
                
                word="";
                count=0;
           }
        }
        
        
        
        if(reverse) res+=new StringBuilder(word).reverse().toString();
        else res+=word;
        return res;

    }
}
