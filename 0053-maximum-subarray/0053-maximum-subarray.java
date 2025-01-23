class Solution {
    public int maxSubArray(int[] nums) {
      int MaxSum = Integer.MIN_VALUE;
      int CurrSum = 0;

        for (int i=0; i<=nums.length-1; i++){
            CurrSum += nums[i];
            if(CurrSum>MaxSum){
                MaxSum = CurrSum;
            }
            if(CurrSum<0){
                CurrSum = 0;
            }
        }return MaxSum;

    }
}