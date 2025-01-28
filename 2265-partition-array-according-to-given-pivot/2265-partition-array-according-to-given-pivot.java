class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] NewArr = new int[nums.length];
        int index =0;

        for(int num : nums){
            if(num < pivot){
                NewArr[index++] = num;
            }  
        }
        for (int num : nums) {
            if (num == pivot) {
                NewArr[index++] = num;
            }
        }for (int num : nums) {
            if (num > pivot) {
                NewArr[index++] = num;
            }
        }return NewArr;
    }
}