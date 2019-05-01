public class Test16 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    //递归版本
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val>list2.val){
            list2.next = Merge(list1,list2.next);
            return list2;
        }else{
            list1.next = Merge(list1.next,list2);
            return list1;
        }

    }

    //非递归版本
//    public ListNode Merge(ListNode list1,ListNode list2) {
//        if(list1==null){
//            return list2;
//        }
//        if(list2==null){
//            return list1;
//        }
//        ListNode resNode = null;
//        ListNode retNode = null;
//
//        while(list1!=null&&list2!=null){
//            if(list1.val>list2.val){
//                if (resNode == null){
//                    resNode = retNode = list2;
//                }else {
//                    resNode.next = list2;
//                    resNode = resNode.next;
//
//                }
//                list2 = list2.next;
//            }else{
//                if (resNode == null){
//                    resNode = retNode = list1;
//                }else {
//                    resNode.next = list1;
//                    resNode = resNode.next;
//
//                }
//                list1 = list1.next;
//            }
//        }
//        if(list1==null){
//            resNode.next = list2;
//        }
//        if(list2==null){
//            resNode.next = list1;
//        }
//        return retNode;
//    }
}
