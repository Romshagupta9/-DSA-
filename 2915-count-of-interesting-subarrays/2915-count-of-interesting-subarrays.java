class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        Map<Integer, Long> countMap = new HashMap<>();
        countMap.put(0, 1L); // Prefix sum 0 initially occurs once
        long result = 0;
        int prefix = 0;

        for (int num : nums) {
            if (num % modulo == k) {
                prefix = (prefix + 1) % modulo;
            } else {
                prefix = prefix % modulo;
            }

            int need = (prefix - k + modulo) % modulo;
            result += countMap.getOrDefault(need, 0L);
            countMap.put(prefix, countMap.getOrDefault(prefix, 0L) + 1);
        }

        return result;
    }
}
