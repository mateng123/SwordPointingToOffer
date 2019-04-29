class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


public class Test04 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length);
        return root;
    }
    public TreeNode reConstructBinaryTree(int[] pre,int preStart,int preEnd,int[] in,int inStart,int inEnd){
        if(preStart>preEnd||inStart>inEnd){
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);

        for(int i=inStart;i<pre.length;i++){
            if(in[i]==pre[preStart]){
                root.left=reConstructBinaryTree(pre,preStart+1,preStart+i-inStart,in,inStart,i-1);
                root.right=reConstructBinaryTree(pre,preStart+1+i-inStart,preEnd,in,i+1,inEnd);
                break;
            }
        }
        return root;
    }
}
