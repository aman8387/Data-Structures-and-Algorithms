class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {//agar koi unique element milta hai toh
                i++;//unique pointer ko = krega
                nums[i] = nums[j];// update karega
            }
        }
        
        return i + 1;// length return krega unique array ki
    }
}