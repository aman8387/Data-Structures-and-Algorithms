class Solution {
    public int countBinarySubstrings(String s) {
        int prevgrp = 0;
        int currgrp = 1;
        int count = 0;

        for(int i =1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                currgrp++;
            }else{
                count += Math.min(currgrp, prevgrp);
                prevgrp = currgrp;
                currgrp = 1;
            }
            
        }count += Math.min(currgrp, prevgrp);
            return count;
    }
}