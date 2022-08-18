class Solution {
    public String convert(String s, int numRows) {
    
       
        if(numRows==1) return s;
         
        HashMap<Integer , String> map = new HashMap<>();
        
        int down=1;
        int up=0;
        int currRow=0;
        
        for(int i=0 ;i<s.length() ;i++){
            map.put(currRow , map.getOrDefault(currRow , "")+s.charAt(i));
            
            if(down==1){
                if(currRow==numRows-1){
                    down=0;
                    up=1;
                    currRow--;
                }
                else currRow++; 
            }
            
            else if(up==1){
                if(currRow==0){
                    up=0;
                    down=1;
                    currRow++;
                }
                else currRow--;
            }
        }
        String res="";
        for(int i : map.keySet()){
            res+=map.get(i);
        }
        return res;
    }
}
