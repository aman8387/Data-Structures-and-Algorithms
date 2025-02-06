class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0;
        int j = 0;

        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i) == str2.charAt(j) || (str1.charAt(i)+1 - 'a')%26 +'a'== str2.charAt(j) ){
                j++;
            }
            i++;
        }
        return j == str2.length();
    }
}