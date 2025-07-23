class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m=grid.length; //no of orows
        int n=grid[0].length; //no of columns(assuming all rows of same length)
        int sum=0;
        for(int row[] : grid){
            Arrays.sort(row);
        }

        for(int j=0;j<n;j++){
            int maxval=0;
            for(int i=0;i<m;i++){
                maxval=Math.max(maxval,grid[i][j]);
            }
            sum+=maxval;
        }
        return sum;
    }
}