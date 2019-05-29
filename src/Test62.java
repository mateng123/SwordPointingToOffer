public class Test62 {
    int index=0;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot!=null)
        {
            TreeNode p = KthNode(pRoot.left,k);
            if(p!=null){
                return p;
            }
            index++;
            if(index==k){
                return pRoot;
            }
            p = KthNode(pRoot.right,k);
            if(p!=null){
                return p;
            }
        }
        return null;
    }
}
