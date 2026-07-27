class Solution {
    // kya root ka left exist kart h 

  public void call(TreeNode root, List<Integer> ans, int depth) {
    if (root == null) return;
    
    if (depth == ans.size()) {   // first time we're at this depth
        ans.add(root.val);
    }
    
    call(root.right, ans, depth + 1);  // go right FIRST
    call(root.left, ans, depth + 1);   // then left
}

public List<Integer> rightSideView(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
    call(root, ans, 0);
    return ans;
}
     
}
