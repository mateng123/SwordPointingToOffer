import java.util.ArrayList;
import java.util.Stack;

class ListNode {
int val;
ListNode next = null;

ListNode(int val) {
    this.val = val;
}
    }


public class Test03 {
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        Stack<Integer> stack = new Stack<>();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        while(listNode!=null){
//            stack.push(listNode.val);
//            listNode = listNode.next;
//        }
//        while(!stack.isEmpty()){
//            arrayList.add(stack.pop());
//        }
//        return arrayList;
//    }


    //递归

        ArrayList<Integer> arrayList = new ArrayList<>();
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            if (listNode!=null){
                printListFromTailToHead(listNode.next);
                arrayList.add(listNode.val);
            }
            return arrayList;
        }

}