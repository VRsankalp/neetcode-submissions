class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length ; 
        int ans [] = new int [2];
        HashMap<Integer ,Integer>hm = new HashMap<>();
        // hm.put(0 , 1);
        int k = 0 ; 
        for(int i = 0 ; i< n ; i++){
            if(hm.containsKey(target - nums[i])){
                ans [0] = hm.get(target - nums[i]);
                ans[1] = i ; 
            }
            hm.put(nums[i] , i );
        }
        
        
        return ans ;
    }
}
