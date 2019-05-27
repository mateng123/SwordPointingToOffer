import java.util.*;
public class Test60 {

    //层序遍历
//    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
//        Queue<TreeNode> s1 = new LinkedList<>();
//        ArrayList<ArrayList<Integer> > list = new ArrayList<>();
//        if(pRoot==null){
//            return list;
//        }
//        s1.offer(pRoot);
//
//        int start=0,end=1;
//        ArrayList<Integer> temp = new ArrayList<>();
//        while(!s1.isEmpty()){
//            start++;
//            TreeNode newNode = s1.poll();
//            temp.add(newNode.val);
//            if (newNode.left!=null) s1.offer(newNode.left);
//            if (newNode.right!=null) s1.offer(newNode.right);
//            if (start==end){
//                end=s1.size();
//                start =0;
//                list.add(temp);
//                temp = new ArrayList<>();
//            }
//        }
//        return list;
//    }

    //递归
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > list = new ArrayList<>();
        dePrint(pRoot,1,list);
        return list;
    }
    public void dePrint(TreeNode pRoot,int depth,ArrayList<ArrayList<Integer> > list){
        if(pRoot==null) return;
        if(depth>list.size()){
            list.add(new ArrayList<>());
        }
        list.get(depth-1).add(pRoot.val);
        dePrint(pRoot.left,depth+1,list);
        dePrint(pRoot.right,depth+1,list);
    }
}
