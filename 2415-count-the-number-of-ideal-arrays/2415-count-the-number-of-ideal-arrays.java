import java.util.*;

class Solution {
    private static final int MOD = 1_000_000_007;

    public int idealArrays(int n, int maxValue) {
        int maxLength = Math.min(14, n);
        List<List<Integer>> factors = getFactors(maxValue);
        long[][] dp = new long[maxLength + 1][maxValue + 1];
        Long[][] mem = new Long[n][maxLength];

        // Initialize for length = 1
        for (int j = 1; j <= maxValue; ++j)
            dp[1][j] = 1;

        // Fill dp for lengths 2 to maxLength
        for (int i = 2; i <= maxLength; ++i) {
            for (int j = 1; j <= maxValue; ++j) {
                for (int k : factors.get(j)) {
                    dp[i][j] += dp[i - 1][k];
                    dp[i][j] %= MOD;
                }
            }
        }

        // dp[i][0] = sum of all dp[i][j] for j from 1 to maxValue
        for (int i = 1; i <= maxLength; ++i) {
            for (int j = 1; j <= maxValue; ++j) {
                dp[i][0] += dp[i][j];
                dp[i][0] %= MOD;
            }
        }

        // Final answer using combinations
        long ans = 0;
        for (int i = 1; i <= maxLength; ++i) {
            ans += dp[i][0] * nCk(n - 1, i - 1, mem) % MOD;
            ans %= MOD;
        }

        return (int) ans;
    }

    private List<List<Integer>> getFactors(int maxValue) {
        List<List<Integer>> factors = new ArrayList<>();
        for (int i = 0; i <= maxValue; ++i)
            factors.add(new ArrayList<>());

        for (int i = 1; i <= maxValue; ++i) {
            for (int j = i * 2; j <= maxValue; j += i) {
                factors.get(j).add(i);
            }
        }

        return factors;
    }

    private long nCk(int n, int k, Long[][] mem) {
        if (k == 0 || n == k) return 1;
        if (mem[n][k] != null) return mem[n][k];

        return mem[n][k] = (nCk(n - 1, k, mem) + nCk(n - 1, k - 1, mem)) % MOD;
    }
}
