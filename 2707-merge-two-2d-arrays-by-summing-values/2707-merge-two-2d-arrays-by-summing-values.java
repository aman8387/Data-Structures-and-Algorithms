import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> result = new ArrayList<>(); //list for dynamic size
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] < nums2[j][0]) {
                result.add(nums1[i]);
                i++;
            } else if (nums1[i][0] > nums2[j][0]) {
                result.add(nums2[j]);
                j++;
            } else {
                result.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            }
        }
        while (i < nums1.length) {// Add remaining elements from nums1
            result.add(nums1[i]);
            i++;
        }
        while (j < nums2.length) {// Add remaining elements from nums2
            result.add(nums2[j]);
            j++;
        }
        return result.toArray(new int[result.size()][]);
    }
}
