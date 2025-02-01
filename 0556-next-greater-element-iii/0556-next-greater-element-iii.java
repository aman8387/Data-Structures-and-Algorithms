class Solution {
    public int nextGreaterElement(int n) {
        char [] nums = Integer.toString(n).toCharArray();
        int length = nums.length;

        int i = length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i == -1) {
            return -1;
        }
        int j = length - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }
        swap(nums, i, j);
        reverse(nums, i + 1, length - 1);

        long result = Long.parseLong(new String(nums));// Convert the char array back to an integer and return
        return result > Integer.MAX_VALUE ? -1 : (int) result;
    }
     private void swap(char[] nums, int i, int j) {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(char[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}