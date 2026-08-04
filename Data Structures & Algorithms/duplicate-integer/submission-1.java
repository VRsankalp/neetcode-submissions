class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length ;
        if(n==0)return false ;
        HashMap<Integer , Integer> hm = new HashMap<>();
        hm.put(nums[0] , 0);
        for(int i = 1 ; i< n ; i++){
            if(hm.containsKey(nums[i])){
                return true ; 

            }
            hm.put(nums[i], i);

        }
        return false ;
        
    }
}