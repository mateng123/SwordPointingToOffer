import java.util.*;

public class Test59 {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        Stack<TreeNode> s1 = new Stack<>();
        s1.push(pRoot);
        Stack<TreeNode> s2 = new Stack<>();
        int layer = 1;
        ArrayList<ArrayList<Integer> > list = new ArrayList<>();
        while(!s1.isEmpty()||!s2.isEmpty()){
            if(layer%2==1){
                ArrayList<Integer> temp = new ArrayList<>();
                while(!s1.isEmpty()){
                    TreeNode newNode = s1.pop();
                    if (newNode!=null){
                        temp.add(newNode.val);
                        System.out.println(newNode.val+' ');
                        s2.push(newNode.left);
                        s2.push(newNode.right);
                    }
                }
                if(!temp.isEmpty()){
                    list.add(temp);
                    System.out.println();
                    layer++;
                }
            }else{
                ArrayList<Integer> temp = new ArrayList<>();

                while(!s2.isEmpty()){
                    TreeNode newNode = s2.pop();
                    if (newNode!=null){
                        temp.add(newNode.val);
                        System.out.println(newNode.val+' ');
                        s1.push(newNode.right);
                        s1.push(newNode.left);
                    }

                }
                if(!temp.isEmpty()){
                    list.add(temp);
                    System.out.println();
                    layer++;
                }
            }
        }
        return list;
    }
}
