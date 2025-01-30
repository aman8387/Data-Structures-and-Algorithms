class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result = new ArrayList<>();
        List<Integer> keyIndices = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                keyIndices.add(i);
            }
        }

        int i = 0, j = 0;
        while (i < nums.length) {
            while (j < keyIndices.size() && keyIndices.get(j) < i - k) {//Move j forward to ensure it's within range
                j++;
            }

            if (j < keyIndices.size() && Math.abs(i - keyIndices.get(j)) <= k) {//i is within distance k of any key index
                if (result.isEmpty() || result.get(result.size() - 1) != i) { //prevent duplicates.
                    result.add(i);
                }
            }
            i++;
        }

        return result;
    }
}
