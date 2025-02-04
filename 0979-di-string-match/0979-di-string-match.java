class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int start = 0;
        int end = n;
        int[] res = new int[n + 1]; // Size should be n+1

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                res[i] = start;
                start++;
            } else { // If it is 'D'
                res[i] = end;
                end--;
            }
        }
        res[n] = start;

        return res;
    }
}
