class Solution {
    public int lev (TreeNode root){
        if(root == null) return 0 ; 
        return 1+ Math.max(lev(root.left), lev(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true ; 
        int left = lev (root.left);
        int right = lev (root.right);
        if(Math.abs(left - right)>1) return false ;
        return isBalanced(root.left)&&isBalanced(root.right);


        
    }
}
