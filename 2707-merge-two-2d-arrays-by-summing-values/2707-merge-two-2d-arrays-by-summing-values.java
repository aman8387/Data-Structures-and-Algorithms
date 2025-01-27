import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        // Create a result list to store merged pairs
        List<int[]> result = new ArrayList<>(); // Using a list for dynamic size

        // Initialize two pointers
        int i = 0;
        int j = 0;

        // Traverse both arrays using two pointers
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] < nums2[j][0]) {
                result.add(nums1[i]);
                i++;
            } else if (nums1[i][0] > nums2[j][0]) {
                result.add(nums2[j]);
                j++;
            } else {
                // IDs match: sum the values and add the pair to the result
                result.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            }
        }
        // Add remaining elements from nums1
        while (i < nums1.length) {
            result.add(nums1[i]);
            i++;
        }
        // Add remaining elements from nums2
        while (j < nums2.length) {
            result.add(nums2[j]);
            j++;
        }
        return result.toArray(new int[result.size()][]);
    }
}
