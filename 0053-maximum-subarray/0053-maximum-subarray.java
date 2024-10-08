class Solution {
    public int maxSubArray(int[] nums) {
        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        for (int val : nums){
            CurrSum += val;
            MaxSum = Math.max(CurrSum, MaxSum);

            if(CurrSum< 0){
                CurrSum =0;
            }
        }
        return MaxSum;
    }
}