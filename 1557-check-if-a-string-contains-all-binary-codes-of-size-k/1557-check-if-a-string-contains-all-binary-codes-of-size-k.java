class Solution {
    public boolean hasAllCodes(String s, int k) {
        int totalCodes = 1 << k;
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
