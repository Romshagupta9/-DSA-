class Solution {
    public int uniquePaths(int m, int n) {
//using bottom up approach : O(m*n);
//we are movig bottom up , ham niche se chal rhe hia and dekh rhe hia ki us particular block---> (ki right or down se)--> destination tak pahuchne k kitne paths hoskte hai...
        int [][]dp=new int[m][n];
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                if(i==m-1 || j==n-1){
                    dp[i][j]=1;
                }
            }
        }
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                dp[i][j]=dp[i+1][j]+dp[i][j+1];
            }
        }
        return dp[0][0];
    }
}