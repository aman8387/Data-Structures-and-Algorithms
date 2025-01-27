class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;

        while(even<nums.length &&odd< nums.length){
            if(nums[even]%2!=0 && nums[odd]%2==0){
                reverse(nums, even,odd);
                even+=2;
                odd+=2;
            }else if(nums[even]%2== 0){
                even+=2;
            }else if((nums[odd]%2!= 0)){
                odd+=2;
            }
        }return nums;
    }
    private void reverse(int[]nums , int start, int end){
        int temp =  nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}