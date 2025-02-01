class Solution {
    public int maxArea(int[] height) {
        int firstpoll = 0;
        int lastpoll = height.length - 1;
        int maxWater = 0;

        while (firstpoll < lastpoll) {
            int area = (lastpoll - firstpoll) * Math.min(height[firstpoll], height[lastpoll]);
            maxWater = Math.max(maxWater, area);

            if (height[firstpoll] < height[lastpoll]) {
                firstpoll++;
            } else {
                lastpoll--;
            }
        }
        return maxWater;
    }
}