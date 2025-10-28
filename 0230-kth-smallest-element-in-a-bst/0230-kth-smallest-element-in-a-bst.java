class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ls = new ArrayList<>();
        return helper(ls, root, k);
    }

    private int helper(List<Integer> ls, TreeNode root, int k) {
        if (root == null) return 0;

        int left = helper(ls, root.left, k);
        if (left != 0) return left;

        ls.add(root.val);
        if (ls.size() == k) return root.val;

        int right = helper(ls, root.right, k);
        if (right != 0) return right;

        return 0;
    }
}
