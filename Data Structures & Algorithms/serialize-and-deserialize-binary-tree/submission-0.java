public class Codec {

    // Serialize
    public String serialize(TreeNode root) {
        if (root == null)
            return "x,";

        return root.val + "," +
               serialize(root.left) +
               serialize(root.right);
    }

    // Deserialize
    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>();

        for (String s : data.split(",")) {
            q.offer(s);
        }

        return helper(q);
    }

    private TreeNode helper(Queue<String> q) {

        String val = q.poll();

        if (val.equals("x"))
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(val));

        root.left = helper(q);
        root.right = helper(q);

        return root;
    }
}