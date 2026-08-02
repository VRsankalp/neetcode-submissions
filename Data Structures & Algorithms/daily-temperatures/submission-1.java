class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length ; 
        Stack<Integer>st = new Stack();
        int ans [] = new int [n];
        for(int i = 0 ; i< n ; i++){
            while(!st.isEmpty()&&temp[st.peek()]<temp[i]){
                int idx = st.pop();
                ans[idx]=i-idx;
                
            }
            st.push(i);

        }
        return ans ; 
        
    }
}
