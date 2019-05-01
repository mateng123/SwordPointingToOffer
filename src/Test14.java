
public class Test14 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

//    //O(N+M)
//    public ListNode FindKthToTail(ListNode head,int k) {
//        int length = 0;
//        ListNode tempNode = head;
//        while (tempNode!=null){
//            tempNode = tempNode.next;
//            length++;
//        }
//        if(k>length){
//            return null;
//        }
//
//        for(int i=0;i<length-k;i++){
//            head = head.next;
//        }
//        return head;
//    }

    //O(n)
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<=0){
            return null;
        }
        ListNode preNode = head;
        ListNode lastNode = head;
        for(int i=0;i<k;i++){
            if(preNode!=null){
                preNode = preNode.next;
            }else{
                return null;
            }
        }
        while(preNode!=null){
            preNode = preNode.next;
            lastNode = lastNode.next;
        }
        return lastNode;
    }
}
