public class Test18 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public void Mirror(TreeNode root) {
        if(root == null){
            return;
        }
        if(root.left==null&&root.right==null){
            return;
        }
        TreeNode tempLeft = root.left;
        root.left = root.right;
        root.right = tempLeft;
        Mirror(root.left);
        Mirror(root.right);
    }
}
