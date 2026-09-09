class Solution {
    public int maxArea(int[] hei) {
        int n = hei.length ; 
        int st = 0 ; 
        int end  = n-1 ; 
        int maxWidth  = 0 ;
        while(st<=end){
            int minh = Math.min(hei[st] , hei[end]);
            int width = end-st ; 
            int waterContain = minh*width;
            maxWidth= Math.max(maxWidth, waterContain);
            if(hei[st]<hei[end])st++;
            else end--;
        } 
        return maxWidth;
    }
}
