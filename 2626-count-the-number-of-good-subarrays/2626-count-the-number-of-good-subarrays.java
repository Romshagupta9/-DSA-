class Solution {
    public long countGood(int[] nums, int k) {
        long ans = 0;
        int pairs = 0;
        Map<Integer, Integer> count = new HashMap<>();
        
        int l = 0;
        for (int r = 0; r < nums.length; ++r) {
            // Increase the number of good subarrays by count of nums[r]
            count.put(nums[r], count.getOrDefault(nums[r], 0));
            pairs += count.get(nums[r]);
            count.put(nums[r], count.get(nums[r]) + 1);
            
            // Shrink window until pairs < k
            while (pairs >= k) {
                count.put(nums[l], count.get(nums[l]) - 1);
                pairs -= count.get(nums[l]);
                l++;
            }
            
            // All subarrays ending at r and starting from index 0 to l-1 are good
            ans += l;
        }
        
        return ans;
    }
}