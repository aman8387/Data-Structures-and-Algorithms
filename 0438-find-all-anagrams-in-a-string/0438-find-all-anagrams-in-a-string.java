class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            sFreq[s.charAt(right) - 'a']++;

            if (right - left + 1 > p.length()) {
                sFreq[s.charAt(left) - 'a']--;
                left++;
            }

            if (Arrays.equals(pFreq, sFreq)) {
                result.add(left);
            }
        }

        return result;
    }
}
