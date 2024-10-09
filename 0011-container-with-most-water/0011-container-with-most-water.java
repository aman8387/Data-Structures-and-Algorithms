class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length-1;
        int MaxWidth = 0;

        while (lp< rp){
            int w = rp-lp;
            int ht = Math.min(height[lp],height[rp]);
            int CurrWidth = w*ht;
            MaxWidth = Math.max(CurrWidth , MaxWidth);

            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }return MaxWidth;
    }
}