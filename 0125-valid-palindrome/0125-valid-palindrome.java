class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        while(start<end){
        if(start<end && !Character.isLetterOrDigit(s.charAt(start))){
            start++;
            continue;
        }if(start<end && !Character.isLetterOrDigit(s.charAt(end))){
            end--;
            continue;
        }if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
            return false; // If mismatch, it's not a palindrome
        }
        start++;
        end--;
        } return true;
    }
}