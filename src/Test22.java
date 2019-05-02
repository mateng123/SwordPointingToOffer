import java.util.ArrayList;

public class Test22 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if(root==null){
            return arrayList;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.remove(0);
            arrayList.add(temp.val);
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }

        }
        return arrayList;
    }
}
