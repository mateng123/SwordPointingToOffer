import java.util.*;
public class Test58 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }


//    boolean isSymmetrical(TreeNode pRoot)
//    {
//        if(pRoot == null){
//            return true;
//        }
//        return comRoot(pRoot.left, pRoot.right);
//    }
//    private boolean comRoot(TreeNode left, TreeNode right) {
//        // TODO Auto-generated method stub
//        if(left == null) return right==null;
//        if(right == null) return false;
//        if(left.val != right.val) return false;
//        return comRoot(left.right, right.left) && comRoot(left.left, right.right);
//    }

    //BFS
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null){
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(pRoot.right);
        stack.push(pRoot.left);
        while(!stack.empty()){
            TreeNode p1 = stack.pop();
            TreeNode p2 = stack.pop();
            if(p1 == null&&p2 == null) continue;
            if(p1 == null||p2 == null) return false;
            if(p1.val!=p2.val) return false;
            stack.push(p1.right);
            stack.push(p2.left);
            stack.push(p2.right);
            stack.push(p1.left);
        }
        return true;
    }
}
