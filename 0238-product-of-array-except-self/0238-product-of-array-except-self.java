class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        int ProductofAllBefore = 1;
        int ProductofAllAfter = 1;

        for (int i = 0; i<n; i++){
            res[i] = ProductofAllBefore;
            ProductofAllBefore *= nums[i];
        } 
        for ( int i =n-1; i>=0; i--){
            res[i] *= ProductofAllAfter;
            ProductofAllAfter *= nums[i];
        }
        return res;
    }
}