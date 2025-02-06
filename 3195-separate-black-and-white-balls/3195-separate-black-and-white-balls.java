class Solution {
    public long minimumSteps(String s) {
        long steps = 0; 
        long ones = 0;  

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                ones++; 
            } else {
                steps += ones; 
            }
        }

        return steps; 
    }
}

// hum traverse karenge or uske baad jitni baar one ayenge increase ones and then if zero appers then add the number of ones into stepsbcoz this is the no. of swaps need to move 0 infront of 1.