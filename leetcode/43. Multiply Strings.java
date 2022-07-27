class Solution {
    public String multiply(String num1, String num2) {
        
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        
       int len1 = num1.length();
       int len2 = num2.length();
       int len= len1+len2;
       int[] res = new int[len];
       int carry=0;

       boolean negative = false;

       if(num1.charAt(0)=='-' && num2.charAt(0)=='-'){
           negative = false;
       }
       else if(num1.charAt(0)=='-' || num2.charAt(0)=='-') negative=true;

       for(int i =0 ;i< len1; i++ ){
           int var1 = Integer.parseInt(String.valueOf(num1.charAt(len1-1-i)));

           for(int j=0 ;j<len2 ;j++){
               int var2 = Integer.parseInt(String.valueOf(num2.charAt(len2-1-j)));

               res[len-1-i-j]+=var1*var2 + carry;
               carry = res[len-1-i-j]/10;
               res[len-1-i-j] = res[len-1-i-j]%10;
           }
           if(carry!=0){
               res[len-1-i-len2] = carry;
               carry=0;
           }


       }

       String result = "";
       boolean noBlank = false;

       for(int i=0 ;i<len ;i++){

           if(res[i]!=0 || noBlank ){       
               result+= String.valueOf(res[i]);
               noBlank = true;
           }
       }
       if(negative) result = '-'+result;

       return result;


    }
}
