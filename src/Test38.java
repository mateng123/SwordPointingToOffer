public class Test38 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

//    //递归算法
//    public int TreeDepth(TreeNode root) {
//        if(root==null){
//            return 0;
//        }
//        int left = TreeDepth(root.left);
//        int right = TreeDepth(root.right);
//        return Math.max(left,right)+1;
//    }




}
