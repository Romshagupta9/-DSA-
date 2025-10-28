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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> bfs=new ArrayList<>();
        if(root==null){
            return bfs;
        }
        Queue <TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer>ls=new ArrayList<>();
            int size=q.size();
        for(int i=0;i<size;i++){
            TreeNode n1=new TreeNode();
            n1=q.poll();
            ls.add(n1.val);
            if(n1.left!=null){
                q.add(n1.left);
            }
            if(n1.right!=null){
                q.add(n1.right);
            } 
            }
            bfs.add(ls); 
        }
        return bfs;
    }
}