class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0) && helper(board,i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean helper(char[][] board,int i,int j, String word,int count){
        if(count==word.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(count)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='*';
        boolean res=helper(board,i+1,j,word,count+1)||
        helper(board,i-1,j,word,count+1)||
        helper(board,i,j+1,word,count+1)||
        helper(board,i,j-1,word,count+1);
        board[i][j]=temp;
        return res;
    }
}