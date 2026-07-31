class Solution {
    public int helper(int []nums , int [] dp  , int i ){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1)return dp[i];
        int take = nums[i]+ helper(nums , dp ,i+2);
        int skip = helper(nums , dp , i+1);
        return dp[i]=Math.max(take , skip ) ; 
    }
    public int rob(int[] nums) {
        int n = nums.length ;
        int dp[]= new int[n] ;
        Arrays.fill(dp , -1 );
        return helper(nums , dp , 0 );
        
    }
}
