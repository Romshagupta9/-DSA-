import java.util.*;

class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] matrix = new int[m][n];
        for (int[] wall: walls)
            matrix[wall[0]][wall[1]] = -1;

        for (int[] guard: guards)
            matrix[guard[0]][guard[1]] = -1;

        for (int[] guard: guards) {
            fillGuarded(guard, matrix);
        }
        
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) count++;
            }
        }

        return count;
    }

    private void fillGuarded(int[] guard, int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = guard[0];
        int col = guard[1];

        for (int i = col + 1; i < cols; i++) {
            if (matrix[row][i] == -1) break;
            matrix[row][i] = 1;
        }

        for (int i = col - 1; i >= 0; i--) {
            if (matrix[row][i] == -1) break;
            matrix[row][i] = 1;
        }

        for (int i = row + 1; i < rows; i++) {
            if (matrix[i][col] == -1) break;
            matrix[i][col] = 1;
        }

        for (int i = row - 1; i >= 0; i--) {
            if (matrix[i][col] == -1) break;
            matrix[i][col] = 1;
        }
    }
}