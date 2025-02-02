class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split("\\s+");// split with space of one or more than one 

        for (String word : words){
            for(int i= word.length()-1; i>=0;i--){//start the index from the last
               sb.append(word.charAt(i));// add the word that is in last to the sb as first
            }
            sb.append(" ");// add spaces also
        }
        return sb.toString().trim();//return string after converting from array and remove front and end spaces using trim.
    }
}