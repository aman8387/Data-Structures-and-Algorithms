class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posPointer = 0;  
        int negPointer = 1; 

        for (int num : nums) {
            if (num > 0) {
                result[posPointer] = num;  
                posPointer += 2;         
            } else {
                result[negPointer] = num; 
                negPointer += 2;         
            }
        }
        
        return result;
    }
}
