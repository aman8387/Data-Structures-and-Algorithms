class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if(n<k)return 0;
        
        int maxsum = 0;
        for(int i = 0; i<k; i++){
            maxsum += nums[i];
        }
        int currsum = maxsum;
        for(int i =k; i<n;i++){
            currsum += nums[i] - nums[i-k];
            maxsum = Math.max(maxsum, currsum);
        }return (double) maxsum/k;
    }
}