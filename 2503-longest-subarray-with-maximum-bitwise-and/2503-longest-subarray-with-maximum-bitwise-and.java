class Solution {
    public int longestSubarray(int[] nums) {
        int ma = 0;
        for(int i : nums)
            ma = Math.max(ma , i);
        int ans = 0 , curr = 0;
        for(int i : nums) {
            if(i==ma)
                curr++;
            else
                curr = 0;
            ans = Math.max(ans,curr);
        }
        return ans;
    }
}