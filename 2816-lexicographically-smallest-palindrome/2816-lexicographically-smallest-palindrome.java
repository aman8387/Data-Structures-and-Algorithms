class Solution {
    public String makeSmallestPalindrome(String s) {
        int start=0;
        int end  = s.length()-1;
        char[] ch = s.toCharArray();

        while(start<end){
            if(ch[start] == ch[end]){
                start++;
                end--;
            }
            if(ch[start] != ch[end]){
                ch[start]= ch[end] = (char) Math.min(ch[start], ch[end]);
                start++;
                end--;
            }
        }return new String(ch);
    }
}