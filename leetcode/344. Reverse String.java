class Solution {
    static void func(int left ,int right , char[]s){
        
        if(left>=right)return;
        
        Character temp = s[left];
        s[left]=s[right];
        s[right]=temp;
        
        func(left+1 ,right-1 , s);
    }
    public void reverseString(char[] s) {
        
        func(0 , s.length-1 , s);
    }
}
