class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] word1 = sentence1.split(" ");
        String[] word2 = sentence2.split(" ");

        int s1 = word1.length, s2 = word2.length;
        if (s1 > s2) {
            return areSentencesSimilar(sentence2, sentence1);
        }
        int l1 = 0, r1 = s1 - 1;
        int l2 = 0, r2 = s2 - 1;
        while (l1 < s1 && word1[l1].equals(word2[l2])) {
            l1++;
            l2++;
        }
        while (r1 >= 0 && word1[r1].equals(word2[r2])) {
            r1--;
            r2--;
        }
        return l1 > r1;
    }
}

