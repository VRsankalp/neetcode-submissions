class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int m = times.length;
        int [] dis = new int [n+1];
        Arrays.fill(dis , Integer.MAX_VALUE);
        dis[k]=0;
        for(int i = 1 ; i<=n-1 ;i++){
            for(int j = 0; j< m ;j++){
                int u  = times[j][0];
                int v  = times[j][1];
                int wt  = times[j][2];
                if(dis[u]!=Integer.MAX_VALUE && dis[u]+ wt < dis[v]){
                    dis[v]= dis[u] + wt ; 
                }
            }


        }
        int max = 0  ; 
        for(int i = 1; i<=n;i++){
            if(dis[i]==Integer.MAX_VALUE) return -1 ;
            max = Math.max(max , dis[i]);
        }
         return max ;



        
    }
}
