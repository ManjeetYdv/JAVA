class Solution {
    public int longestStrChain(String[] words) {
        
        
        Arrays.sort(words , (String a  , String b)->a.length()-b.length());  //sorting by length
        HashMap<String  , Integer> map = new HashMap<>();

        int maxLength=1;
        for(String word : words){

            int len=1;
            StringBuilder str = new StringBuilder(word);

            for(int i=0 ;i<word.length();i++){
                str.deleteCharAt(i);
                String temp = str.toString();
                len = Math.max(len , map.getOrDefault(temp, 0)+1);
                str.insert(i , word.charAt(i));
            }

            map.put(word , len);
            maxLength =Integer.max(maxLength , len);


        }

        return maxLength;
    }
}
