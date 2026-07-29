class Solution {
    int answer = Integer.MIN_VALUE ;
    public int path(TreeNode root){
        if(root==null) return 0  ; 
        int left = Math.max(0, path(root.left));
        int right = Math.max(0, path(root.right));
        
        answer = Math.max( root.val + left +right , answer);
        return root.val+Math.max(left , right);
        

    }
    public int maxPathSum(TreeNode root) {
        path(root);
        return answer;
        
    }
}
