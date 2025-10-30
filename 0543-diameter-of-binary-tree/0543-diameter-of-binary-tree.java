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
    public int maxDepth(TreeNode root) {
         if(root==null){
             return 0; 
            } 
             int left=maxDepth(root.left); 
             int right=maxDepth(root.right); 
             return Math.max(left,right)+1; 
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftd=diameterOfBinaryTree(root.left);
        int rightd=diameterOfBinaryTree(root.right);

        int lefth=maxDepth(root.left);
        int righth=maxDepth(root.right);
        int height=lefth+righth;

        return Math.max(Math.max(rightd,leftd),height);
    }
}