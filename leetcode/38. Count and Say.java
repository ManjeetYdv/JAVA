// class Solution {
//     public String countAndSay(int n) {
//         if (n == 1) return "1";

//         String a ="1";
        
//         for (int i = 1; i < n; i++) {    
//             String b= "";
            
//             for(int j=0 ;j<a.length() ;j++){  //
//                 char c = a.charAt(j);
//                 int count=0;
//                 int k=j;
                
//                 for(k=j ;k<a.length();k++){
//                     if(a.charAt(k)==c) count++;
//                     else break;
//                 }
//                 b+=Integer.toString(count)+c;
//                 j=k-1;
//             }
            
//             a=b;
//         }
        
//         return a;

//     }
// }
class Solution {
    public String countAndSay(int n) {
        if (n ==1) {
          return "1";
        }

        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            sb = getNextState(sb);
        }
        return sb.toString();
    }

    private StringBuilder getNextState(StringBuilder curSb) {
        StringBuilder nextSb = new StringBuilder();
        int len = curSb.length();
        int i = 0;
		
        while (i < len) {
            char c = curSb.charAt(i++);
            int count = 1;
            while (i < len && c == curSb.charAt(i)) {
                count++;
                i++;
            }
            nextSb.append(count).append(c);
        }
		
        return nextSb;
    }
}
