class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // yeh agr k ki value n se badi hui toh uske kaam aa rha hai 
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end){ // yeh ek helper ki trh kaam kar rha hai joh ki reverse ko bta rha hai ki kya krna hai
        while(start<end){// swaping ho rhi hai
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
}
