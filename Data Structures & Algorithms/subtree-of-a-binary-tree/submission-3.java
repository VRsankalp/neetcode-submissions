class Solution {  
    public boolean st(TreeNode p , TreeNode q){
        if(p==null && q== null) return true  ; 
        if(p==null || q== null) return false  ; 
        if(p.val!=q.val) return false ;
        return st(p.left , q.left ) && st(p.right , q.right);

    }
    public boolean check(TreeNode p , TreeNode q){
        if(p==null) return false ;
        if(st(p,q)){
            return true;
        }
        return check (p.left , q ) || check(p.right , q ) ; 


    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return check(root , subRoot);


    }
}
