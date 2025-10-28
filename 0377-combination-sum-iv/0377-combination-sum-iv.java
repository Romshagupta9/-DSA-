// class Solution {
//     int var=0;
//     public int combinationSum4(int[] nums, int target) {
//         int count=helper(nums,target);
//         return count;
//     }
//     private int helper(int[] nums, int target){
//         if(target<0){
//             return 0;
//         }
//         if(target==0){
//             return 1;
//         }
//         int count=0;
//         for(int j=0;j<nums.length;j++){
//             count=count+helper(nums,target-nums[j]);
//         }
//         return count;
//     }
// }
class Solution {
    public int combinationSum4(int[] nums, int target) {
        int dp[] = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int j : nums)
                if (j <= i)
                    dp[i] += dp[i - j];
        }
        return dp[target];
    }
}