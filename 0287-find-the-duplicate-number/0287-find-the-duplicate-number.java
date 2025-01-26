class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for (int num : nums){
            if(map.contains(num)){
                return num;
            }
            map.add(num);
        }
        return-1;
    }
}