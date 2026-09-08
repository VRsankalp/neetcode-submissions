class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length; 
        int m = grid[0].length ;
        int freshOranges = 0 ; 
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0 ; i<n ; i++){
            for(int j =0 ; j< m ; j++){
                if(grid[i][j]==2) q.add(new int[]{i , j } );
                if(grid[i][j]==1) freshOranges++;


            }
        }
        int dir[][] ={{1,0 } , {-1, 0 } ,{0,1 }, {0,-1}};
        int ans = 0 ; 
        while(q.size()>0){
            int le = q.size();
            while(le-->0){
            int [] cu = q.remove();
            int f = cu[0];
            int di = cu[1];
                for(int d[] : dir){
                    int i = d[0] + f;
                    int j = d[1]+ di;
                    if(i>=0 && i<n && j>=0 && j<m && grid[i][j]==1){
                        grid[i][j]=2;
                        freshOranges--;
                        q.add(new int[]{i , j });
                    }
                }
            }
                ans++;
        } 
        if(freshOranges!=0) return - 1;
        if(ans==0) return 0 ;
        return ans -1  ; 

    }
}
