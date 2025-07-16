class Solution {
    public static int maximumLength(int[] nums) {
        int n = nums.length;
        if (n == 2) return 2;

        boolean z = (nums[0] & 1) == 1; // true if odd, false if even
        int[] len = new int[3];
        len[0] = z ? 0 : 1; // even count
        len[1] = z ? 1 : 0; // odd count
        len[2] = 1;         // alternating count

        for (int i = 1; i < n; i++) {
            boolean x = (nums[i] & 1) == 1;
            len[x ? 1 : 0]++; // increment odd/even count
            if (x != z) {
                len[2]++; // alternating count
                z = !z;   // flip parity
            }
        }

        return Math.max(len[0], Math.max(len[1], len[2]));
    }
}
