public class Test55 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null||pHead.next==null){
            return null;
        }
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        while(p2.next!=null||p2.next.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1==p2){
                p2 = pHead;
                while(p1!=p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                return p1;
            }
        }
        return null;
    }
}
