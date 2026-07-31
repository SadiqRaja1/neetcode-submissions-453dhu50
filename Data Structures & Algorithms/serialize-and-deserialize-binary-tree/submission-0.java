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

public class Codec {

    // Encodes a tree to a single string.
    StringBuilder ans = new StringBuilder();
    public String serialize(TreeNode root) {
        if(root == null) return ans.toString();
        helper(root);

        return ans.toString();
    }

    private void helper(TreeNode root){
        if(root == null){
            ans.append(-1);
            ans.append(',');
            return;
        }
        ans.append(root.val);
        ans.append(',');
        helper(root.left);
        helper(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;

        String[] arr = data.split(",");
        index = 0;

        return build(arr);
    }

    int index = 0;

    TreeNode build(String[] arr) {
        if (arr[index].equals("-1")) {
            index++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(arr[index++]));

        node.left = build(arr);
        node.right = build(arr);

        return node;
    }
}
