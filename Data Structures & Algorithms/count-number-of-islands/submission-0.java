class pair{
    int first;
    int second;
    pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public void bfs(int row,int col,int[][]vis,char [][]grid){
        int n=grid.length;
        int m=grid[0].length;
        vis[row][col]=1;
        Queue<pair>q=new LinkedList<>();
        q.add(new pair(row,col));
        int []delrow={-1,0,1,0};
        int[]delcol={0,1,0,-1};
        while(!q.isEmpty()){
            int crow=q.peek().first;
            int ccol=q.peek().second;
            q.poll();
            for(int i=0;i<4;i++){
                int nrow=crow+delrow[i];
                int ncol=ccol+delcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1'&& vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    q.add(new pair(nrow,ncol));
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][]vis=new int[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    cnt++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
        
    }
}
