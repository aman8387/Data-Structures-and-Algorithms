class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxL = 0;
        int maxF = 0;
        int n = s.length();

        while (right < n) {
            mp.put(s.charAt(right), mp.getOrDefault(s.charAt(right), 0) + 1);
            maxF = Math.max(maxF, mp.get(s.charAt(right)));

            if ((right - left + 1) - maxF > k) {
                mp.put(s.charAt(left), mp.get(s.charAt(left)) - 1);
                left++;
            }

            maxL = Math.max(maxL, right - left + 1); 
            right++;
        }
        return maxL;
    }
}