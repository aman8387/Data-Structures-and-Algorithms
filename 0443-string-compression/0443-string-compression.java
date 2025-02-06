class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int n = chars.length;
        
        int i = 0;        
        while (i < n) {
            char currentChar = chars[i];
            int count = 0;
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }
            
            chars[index++] = currentChar;
            if (count > 1) {
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[index++] = digit;
                }
            }
        }
        return index;
    }
}
