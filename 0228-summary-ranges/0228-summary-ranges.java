class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls = new ArrayList<>();
        int n = nums.length;

        if (n == 0) return ls; // \U0001f448 Fix for empty array

        int start = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    ls.add("" + start);
                } else {
                    ls.add(start + "->" + nums[i - 1]);
                }
                start = nums[i]; // update start to new range
            }
        }

        // Add the last range
        if (start == nums[n - 1]) {
            ls.add("" + start);
        } else {
            ls.add(start + "->" + nums[n - 1]);
        }

        return ls;
    }
}
