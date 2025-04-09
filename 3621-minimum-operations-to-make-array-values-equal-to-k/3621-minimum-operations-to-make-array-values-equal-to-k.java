class Solution {
    public int minOperations(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) {
                return -1;
            }
        }
        TreeSet<Integer> greaterThanK = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > k) {
                greaterThanK.add(nums[i]);
            }
        }
        return greaterThanK.size();
    }
}