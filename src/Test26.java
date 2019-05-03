public class Test26 {
    TreeNode head = null;
    TreeNode readHead = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        ConvertHelper(pRootOfTree);
        return readHead;
    }

    public void ConvertHelper(TreeNode pRootOfTree){
        if(pRootOfTree==null){
            return;
        }
        ConvertHelper(pRootOfTree.left);
        if(head==null){
            head=readHead=pRootOfTree;
        }else{
            head.right = pRootOfTree;
            pRootOfTree.left = head;
            head = pRootOfTree;
        }
        ConvertHelper(pRootOfTree.right);
    }
}
