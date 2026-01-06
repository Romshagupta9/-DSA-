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
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode>q =new LinkedList<>();
        q.offer(root);

        int level=1;
        int maxlevel=1;//answer
        int maxsum=root.val;

        while(!q.isEmpty()){
            int size=q.size();
            int currlevelsum=0;
            for(int i=0;i<size;i++){
                TreeNode t=q.poll();
                currlevelsum+=t.val;
                if (t.left != null) q.offer(t.left);
                if (t.right != null) q.offer(t.right);
            }
           if (currlevelsum > maxsum) {
                maxsum = currlevelsum;
                maxlevel = level;
            }

            level++; // move to next level
        }
        return maxlevel;
    }
}