public class Test17 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null||root2==null){
            return false;
        }
        return isHave(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);

    }

    public boolean isHave(TreeNode root1,TreeNode root2){
        if (root2==null){
            return true;
        }
        if(root1==null){
            return false;
        }
        if (root1.val==root2.val){
            return isHave(root1.left,root2.left)&&isHave(root1.right,root2.right);
        }else {
            return false;
        }

    }
}