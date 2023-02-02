class Solution {
     public boolean isAlienSorted(String[] words, String order) {

        if(words.length==1) return true;
        
        HashMap<Character , Integer> map = new HashMap<>();
        int x = 0;
        for(char ch : order.toCharArray()) map.put(ch , x++);

        for(int i=0 ;i<words.length-1 ;i++){
            if(!check(words[i] , words[i+1]  , map)) return false;
        }
        
        return true;
     }

    private boolean check(String word1 , String word2  , HashMap<Character , Integer> map){

         int len = word1.length()>word2.length() ? word2.length() :  word1.length();

        for(int i=0 ;i<len ;i++){
            if(word1.charAt(i)==word2.charAt(i)) continue;
            if(map.get(word1.charAt(i))<map.get(word2.charAt(i))) return true;
            if(map.get(word1.charAt(i))>map.get(word2.charAt(i))) return false;
        }
        if(word1.length()>word2.length()) return false;
        return true;


    }
}
