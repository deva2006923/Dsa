class Solution {
    
    public List<List<String>> solveNQueens(int n) {
       
        boolean qmatrix[][] = new boolean[n][n];
        return countqueen(qmatrix,0);

        
    }
    public static List<List<String>> countqueen(boolean[][] board, int r) {
        List<List<String>> res=new ArrayList<>();

        if (r == board.length) {
            res.add(display(board));
            return res;

           
        }
       
        for (int c = 0; c < board[0].length; c++) {
            board[r][c] = true;
            boolean q = checkqueen(board, r, c);
            if (q) {
                res.addAll(countqueen(board, r + 1));
            }
            board[r][c] = false;


        }
        return res;
    }
     public static boolean checkqueen(boolean[][] board, int r, int c) {
       
        for(int i=r-1,j=c-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]){
                return false;
            }
            

        }

        for(int i=r-1,j=c+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]){
                return false;
            }
            

        }
        for(int i=r-1;i>=0;i--){
            if(board[i][c]){
                return false;
            }

        }
        return true;
    }    

    public static List<String> display(boolean[][] board) {
        List<String> ans=new ArrayList<>();
        for (boolean[] row : board) {
            String s="";
            for (boolean col : row) {
                if (col) {
                    s=s+"Q";
                    
                } else {
                    s=s+".";
                  
                }
            }
            ans.add(s);
            
        }
        return ans;
    }    
}
