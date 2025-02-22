class Solution {
    public boolean hasAllCodes(String s, int k) {
        int totalCodes = 1 << k; // k = 3, then 1 << 3 = 2^3 = 8
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i <= s.length() - k; i++) {
            set.add(s.substring(i, i + k));
            if (set.size() == totalCodes) { 
                return true;
            }
        }

        return false;
    }
}
