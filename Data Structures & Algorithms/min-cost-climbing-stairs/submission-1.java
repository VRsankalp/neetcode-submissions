class Solution {
    public int helper(int []cost , int i , int[]dp){
        if(i==0)return cost[0];
        if(i==1)return cost[1];
        if(dp[i]!=-1)return dp[i];
        int s1 = cost[i] + helper(cost , i-1 , dp);
        int s2 = cost[i] + helper(cost , i-2 , dp);
        return dp[i]=Math.min(s1 , s2);


    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length ; 
        int dp[] = new int [n] ;
        Arrays.fill(dp , -1 );
        return Math.min(helper(cost , n-1 , dp) , helper(cost , n-2 , dp));

        
    }
}
