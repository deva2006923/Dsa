class Solution {
    
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(helper(i,j,board,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean helper(int r,int c,char[][] b,String up,int ind){
        if(ind==up.length()){
            
            return true;
        }
        if(r<0||c<0||r==b.length||c==b[0].length||up.charAt(ind)!=b[r][c]){
            return false;
        }
       
        char ch=b[r][c];
        b[r][c]='@';
       
        boolean ri=helper(r,c+1,b,up,ind+1) || helper(r,c-1,b,up,ind+1) || helper(r-1,c,b,up,ind+1) || helper(r+1,c,b,up,ind+1); 
        b[r][c]=ch;
        return ri;
    }

    

}
