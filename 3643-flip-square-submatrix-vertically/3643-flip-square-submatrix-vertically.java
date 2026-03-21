class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

        for (int j = y; j < y + k; j++) {
            Stack<Integer> stk = new Stack<>();
            for(int i=x; i<x+k; i++){
                stk.push(grid[i][j]);
            }
            for(int i=x; i<x+k; i++){
                grid[i][j]=stk.pop();
            }
        }
        return grid;
    }
}