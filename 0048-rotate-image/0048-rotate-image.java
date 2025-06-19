class Solution {
    public void rotate(int[][] matrix) {
        //step1: vertically swap all rows(reverse) :
        // Yaani first row aur last row ko swap karo, fir second row aur second-last row ko... and so on.

        //step2: transpose them, (matrix ke diagonally opposite elements ko swap karo)
         int n=matrix.length;
         int i=0;
         int j=matrix.length-1;
         while(i<j){
            int[] temp=matrix[i];
            matrix[i]=matrix[j];
            matrix[j]=temp;
            i++;
            j--;
         }

         for(int p=0;p<n;p++){
            for(int q=p+1;q<n;q++){
                int temp=matrix[p][q];
                matrix[p][q]=matrix[q][p];
                matrix[q][p]=temp;
            }
         }
    }
}