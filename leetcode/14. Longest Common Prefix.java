class Solution {
    
    
    public String longestCommonPrefix(String[] strs) {
        
        int limit = Integer.MAX_VALUE;
        
          for (String str : strs) {
            limit = Math.min(limit, str.length());
           }
        
            StringBuilder sb = new StringBuilder();
        
            for (int i = 0; i < limit; i++) {
                char c = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (c != strs[j].charAt(i)) {
                        return sb.toString();
                    }
                }
                sb.append(c);
            }
        
        return sb.toString();
	
    }
}
