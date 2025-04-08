class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i=0;i<nums.length;i++) {
            sum=sum+nums[i];
        }

        if (sum % 2 != 0){ 
            return false;
        }

        int target = sum / 2;
        int n = nums.length;

        boolean[][] dp = new boolean[n + 1][target + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= n; i++) {
            int curr = nums[i - 1];
            for (int j = 1; j <= target; j++) {
                if (j < curr) {
                    dp[i][j] = dp[i - 1][j];
                }
                
                 else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - curr];
                }
            }
        }
        return dp[n][target];
    }
}
