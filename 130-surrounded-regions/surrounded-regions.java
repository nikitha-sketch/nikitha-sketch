class Solution {
    int n=0;
    int m=0;
    public void solve(char[][] board) {
        m=board.length;
        n=board[0].length;
        for(int i=0;i<m;i++){
            if(board[i][0]=='O')dfs(i,0,board);
            if(board[i][n-1]=='O')dfs(i,n-1,board);
        }
        for(int j=0;j<n;j++){
            if(board[0][j]=='O')dfs(0,j,board);
            if(board[m-1][j]=='O')dfs(m-1,j,board);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                if(board[i][j]=='#'){
                    board[i][j]='O';
                }
            }
        }
    }
    int dRow[]={0,1,0,-1};
    int dCol[]={-1,0,1,0};
    public void dfs(int i,int j,char board[][]){
        board[i][j]='#';
        for(int k=0;k<4;k++){
            int row=i+dRow[k];
            int col=j+dCol[k];
            if(row<0 || col<0 || row>=m || col>=n ||board[row][col]!='O')continue;
            dfs(row,col,board);
        }
    }
}