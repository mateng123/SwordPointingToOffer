import java.util.ArrayList;

public class Test24 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> temp = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null){
            return res;
        }
        temp.add(root.val);
        target -= root.val;
        if(target==0&&root.left==null&&root.right==null){
            res.add(new ArrayList<Integer>(temp));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        temp.remove(temp.size()-1);
        return res;
    }
}
