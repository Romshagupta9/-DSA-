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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1=new ArrayList<>();
        List<Integer> leaves2=new ArrayList<>();
        getleaves(root1,leaves1);
        getleaves(root2,leaves2);
        return leaves1.equals(leaves2);
    }

    public void getleaves(TreeNode root, List<Integer> leaves){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            leaves.add(root.val);
            return;
        }

        getleaves(root.left,leaves);
        getleaves(root.right,leaves);
    }
}