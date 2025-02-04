class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int result[] = new int[n];
        int previousC = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == c){
                previousC = i;
            }
            result[i] = (previousC == Integer.MAX_VALUE)? Integer.MAX_VALUE : i- previousC;
        }

        previousC = Integer.MAX_VALUE;
        for(int i = n-1; i>=0 ; i--){
             if (s.charAt(i) == c) {
                previousC = i; 
            }
            result[i] = Math.min(result[i] , (previousC == Integer.MAX_VALUE)? Integer.MAX_VALUE : previousC- i);
        }
        return result;
    }
}