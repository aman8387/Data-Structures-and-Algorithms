/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){ // check kar rha hia yeh leaf node ki value target se match kar rhi hai ya nahi
            return root.val == targetSum;
        }
        int newSum = targetSum - root.val; // new sum value hai har root kai value ko substract krne ke baad
        return hasPathSum(root.left, newSum) || hasPathSum(root.right, newSum);
    }
}