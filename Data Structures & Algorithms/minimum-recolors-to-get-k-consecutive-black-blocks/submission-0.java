class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int cW = 0 ;
        for(int i = 0 ; i< k ; i++){
            if(blocks.charAt(i)=='W'){
                cW++;
            }
        }
        int ans = cW;
        for(int i = k ; i< n ; i++){
            if(blocks.charAt(i-k)=='W') cW--;
            if(blocks.charAt(i)=='W') cW++ ; 
            ans = Math.min(ans , cW);


        }
        return ans;


        
    }
}