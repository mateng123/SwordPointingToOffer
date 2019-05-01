public class Test15 {

//    //递归
//    public ListNode ReverseList(ListNode head) {
//        if(head==null||head.next==null){
//            return head;
//        }
//        ListNode pHead = ReverseList(head.next);
//
//        head.next.next = head;
//        head.next = null;
//
//        return pHead;
//    }

    //循环
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}
