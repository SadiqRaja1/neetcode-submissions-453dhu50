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
    int count = 0;
    public int goodNodes(TreeNode root) {

        check(root, root.val);
        return count;
    }

    public void check(TreeNode root, int maxSoFar){
        if(root == null) return;

        if(root.val >= maxSoFar) count++;
            
        maxSoFar = Math.max(maxSoFar, root.val);
        check(root.left, maxSoFar);
        check(root.right, maxSoFar);
        
    }
}
