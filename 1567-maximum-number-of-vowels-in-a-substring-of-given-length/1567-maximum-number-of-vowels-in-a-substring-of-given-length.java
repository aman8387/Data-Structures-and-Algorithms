class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');

        int maxVowels = 0, currVowelCount = 0;

        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                currVowelCount++;
            }
        }
        maxVowels = currVowelCount;

         for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                currVowelCount++; 
            }
            if (vowels.contains(s.charAt(i - k))) {
                currVowelCount--; 
            }
            maxVowels = Math.max(maxVowels, currVowelCount);
        }

        return maxVowels;
    }
}
