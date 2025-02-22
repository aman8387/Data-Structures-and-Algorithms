class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] s1freq = new int[26]; 
        int[] s2freq = new int[26];

        for (char ch : s1.toCharArray()) {
            s1freq[ch - 'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            s2freq[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1freq, s2freq)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            s2freq[s2.charAt(i) - 'a']++;          
            s2freq[s2.charAt(i - s1.length()) - 'a']--;

            if (Arrays.equals(s1freq, s2freq)) {
                return true;
            }
        }

        return false;
    }
}
