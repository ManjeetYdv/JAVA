class Solution {
    public String reverseWords(String s) {
        
//      The string \s is a regular expression that means "whitespace", and you have to write it with two backslash characters ( "\\s" ) when writing it as a string in Java.   
        
    String[] words = s.split("\\s");
    
    StringBuilder str = new StringBuilder("");
    
     for(int i=words.length-1; i>=0; i--) {
        
        if(words[i] == "") {
          
            continue;
        }
        
        if(i==0) {
            str.append(words[i]);
        }
        else
        str.append(words[i]+" ");
    }
    
    return str.toString().trim();
    }
}
