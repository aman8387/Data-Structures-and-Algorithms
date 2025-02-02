class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split("\\s+");// split with space of one or more than one 

        for (String word : words){
            StringBuilder temp = new StringBuilder(word);//new string name temp where we store the new reverse words
            temp.reverse();
            sb.append(temp); // add reverse words to temp string 
            sb.append(" "); // add spaces also
        }
        return sb.toString().trim();//return string after converting from array and remove front and end spaces using trim.
    }
}