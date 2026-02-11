


/*
class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public void bfs(int ro, int co, int vis[][], char grid[][]) {
        vis[ro][co] = 1;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(ro, co));
        int n = grid.length;
        int m = grid[0].length;
        while (!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            q.poll();

            for (int delrow = -1; delrow <= 1; delrow++) {
                for (int delcol = -1; delcol <= 1; delcol++) {
                    int nrow = row + delrow;
                    int ncol = col + delcol;
                    if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0) {
                        vis[nrow][ncol] = 1;
                        q.add(new Pair(nrow, ncol));
                    }
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        int cnt = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (vis[row][col] == 0 && grid[row][col] == '1') {
                    cnt++;
                    bfs(row, col, vis, grid);
                }
            }
        }
        return cnt;
    }
}*/


/*import java.util.*;

class Solution {
    public void bfs(int row, int col, int[][] vis, char[][] grid) {
        vis[row][col] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row, col});
        
        int n = grid.length;
        int m = grid[0].length;
        
        // Define directions: up, right, down, left
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};
        
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int currRow = cell[0];
            int currCol = cell[1];
            
            for (int i = 0; i < 4; i++) {
                int newRow = currRow + dRow[i];
                int newCol = currCol + dCol[i];
                
                // Check boundaries and whether the cell is unvisited land
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m 
                    && grid[newRow][newCol] == '1' && vis[newRow][newCol] == 0) {
                    vis[newRow][newCol] = 1;
                    q.add(new int[]{newRow, newCol});
                }
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int count = 0;
        
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (vis[row][col] == 0 && grid[row][col] == '1') {
                    count++;
                    bfs(row, col, vis, grid);
                }
            }
        }
        
        return count;
    }
}
*/

class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0')
            return;

        grid[i][j]='0'; // mark visited

        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}
