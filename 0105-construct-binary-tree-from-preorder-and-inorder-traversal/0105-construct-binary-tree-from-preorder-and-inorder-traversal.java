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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return helper(preorder,hm,0,0,inorder.length-1);
    } 
    private TreeNode helper(int[] preorder,Map<Integer,Integer> hm
    ,int rootindex,int left,int right){
        TreeNode root=new TreeNode(preorder[rootindex]);
        int mid=hm.get(preorder[rootindex]);
        if(mid>left){
            root.left=helper(preorder,hm,rootindex+1,left,mid-1);
        }
        if(mid<right){
            root.right=helper(preorder,hm,rootindex+mid+1-left,mid+1,right);
        }
        return root;
    }
}