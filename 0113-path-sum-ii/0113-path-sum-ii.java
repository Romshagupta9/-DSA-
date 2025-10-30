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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        helper(res,ls,root,targetSum);
        return res;
    } 
    private void helper(List<List<Integer>> res, List<Integer> ls,TreeNode root, int targetSum){
        if(root==null){
            return ;
        }
        ls.add(root.val);
        if(targetSum-root.val==0 && root.left==null && root.right==null){
            res.add(new ArrayList<>(ls));
        }
        helper(res,ls,root.left,targetSum-root.val);
        helper(res,ls,root.right,targetSum-root.val);
        ls.remove(ls.size()-1);
    }
}  
