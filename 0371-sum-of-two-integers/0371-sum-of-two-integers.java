class Solution {
    public int getSum(int a, int b) {
        int carry = b;
        int getSum = a; 
        while(carry != 0) {
            getSum = a ^ b; 
            carry = (a & b) << 1; 

            a = getSum; 
            b = carry;  
        }
        return getSum;
    }
}