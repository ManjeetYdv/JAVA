class Solution {
    public String convert(String s, int numRows) {
        //Brute Force  , will optimize later
        if(numRows==1) return s;
        
        char [][] arr = new char[numRows][s.length()];
        for(char[] a : arr){
            Arrays.fill(a , '/');
        }
        int i=0;
        int j=0;
        int down =1;
        int up=0;
        for(int k=0 ;k<s.length() ;k++){
            
            if(down==1){
                arr[i][j]= s.charAt(k);
                
                if(i==numRows-1){
                    down=0;
                    up=1;
                    i--;
                    j++; 
                    
                }
                else i++;
            }
           else if(up==1){
                
                arr[i][j] = s.charAt(k);
                if(i==0){
                    down=1;
                    up=0;
                    i++;
                }
                else {
                    i--;
                    j++;
                }
            }
        }
        String res ="";
        for(char []a : arr){
            for(char ch : a){
                if(ch!='/') res+=ch;
            }
        }
        return res;
        
    }
}
