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
    List<Integer> l = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        dfs(root);
        System.out.print(l);
        return l.get(k-1);
    }

    private void dfs(TreeNode root){
        if(root == null) return;

        dfs(root.left);
        l.add(root.val);
        dfs(root.right);
    }
}
