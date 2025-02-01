class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int alice = 0, bob = plants.length - 1;
        int remainingA = capacityA, remainingB = capacityB;
        int refills = 0;

        while (alice <= bob) {
            if (alice == bob) {  // Both reach the same plant
                if (Math.max(remainingA, remainingB) < plants[alice]) {
                    refills++;  // One of them refills
                }
                break;
            }

            if (remainingA < plants[alice]) {
                remainingA = capacityA;//refill
                refills++;
            }
            remainingA -= plants[alice];

            if (remainingB < plants[bob]) {
                remainingB = capacityB;//refill
                refills++;
            }
            remainingB -= plants[bob];

            alice++;
            bob--;
        }
        return refills;
    }
}
