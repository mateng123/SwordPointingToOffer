public class Test36 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null){
            return null;
        }
        int length1 = 0;
        int length2 = 0;
        ListNode curNode1 = pHead1;
        ListNode curNode2 = pHead2;
        while(curNode1!=null){
            length1++;
            curNode1 = curNode1.next;
        }
        while(curNode2!=null){
            length2++;
            curNode2 = curNode2.next;
        }
        if(length1>length2){
            for(int i=0;i<length1-length2;i++){
                pHead1 = pHead1.next;
            }
            for(int i=0;i<length2;i++){
                if(pHead1.val==pHead2.val&&pHead1.next==pHead2.next){
                    return pHead1;
                }
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
        }else{
            for(int i=0;i<length2-length1;i++){
                pHead2 = pHead2.next;
            }
            for(int i=0;i<length1;i++){
                if(pHead1.val==pHead2.val&&pHead1.next==pHead2.next){
                    return pHead1;
                }
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
        }
        return null;
    }
}
