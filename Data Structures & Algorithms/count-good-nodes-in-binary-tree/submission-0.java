/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int goodNodes(TreeNode root) {
        return helper(root , 0 , Integer.MIN_VALUE);
        
    }
    private int helper(TreeNode root , int ans , int cm){
        if(root==null) return 0; 
        int ra = 0 ; 
        if(root.val>=cm){
            ra =1 ;
            cm = root.val;
        }
        int l = helper(root.left , ans , cm );
        int r = helper(root.right , ans , cm );
        return l + r + ra  ; 


    
    }
}
