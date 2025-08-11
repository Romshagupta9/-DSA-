class Solution {
    final int MOD = 1_000_000_007;

    public int[] productQueries(int n, int[][] queries) {
        // Step 1: extract the powers of 2 that sum to n
        List<Long> powers = new ArrayList<>();
        int bit = 0;
        int temp = n;
        while (temp > 0) {
            if ((temp & 1) == 1) {
                powers.add((1L << bit) % MOD); // safe bit shift
            }
            bit++;
            temp >>= 1;
        }
        powers.sort(Long::compareTo);

        // Step 2: answer queries by multiplying in the range
        int q = queries.length;
        int[] result = new int[q];

        for (int i = 0; i < q; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            long prod = 1;
            for (int j = start; j <= end; j++) {
                prod = (prod * powers.get(j)) % MOD;
            }
            result[i] = (int) prod;
        }

        return result;
    }
}