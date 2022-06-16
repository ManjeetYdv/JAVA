class Solution {
    
    public static int intValue(Character c){
        
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
                      
        }
        return 0;
    }
    public int romanToInt(String s) {
        
        int p=0;
        int ans =0;
        for(int i= s.length()-1 ;i>=0 ;i--){
            
            if(intValue(s.charAt(i))>=p){
                ans += intValue(s.charAt(i));
                
            }
            else{
                ans-= intValue(s.charAt(i));
            }
            
            p= intValue(s.charAt(i));
            
            
        }
        
        return ans;
        
    }
}
