public class Test25 {

    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null){
            return null;
        }
        RandomListNode curNode = pHead;
        //1、复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面
        while(curNode!=null){
            RandomListNode newNode = new RandomListNode(curNode.label);
            newNode.next = curNode.next;
            curNode.next = newNode;
            curNode = newNode.next;
        }

        curNode = pHead;
        //2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
        while(curNode!=null){
            curNode.next.random = curNode.random==null?null:curNode.random.next;
            curNode = curNode.next.next;
        }

        //3、拆分链表，将链表拆分为原链表和复制后的链表
        curNode = pHead;

        RandomListNode resNode = pHead.next;
        while(curNode!=null){
            RandomListNode copyNode = curNode.next;
            curNode.next = copyNode.next;
            copyNode.next = copyNode.next==null?null:copyNode.next.next;
            curNode=curNode.next;
        }
        return resNode;
    }
}
