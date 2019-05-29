import  java.util.*;

public class Test63 {
    int count = 0;
    private PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1,Integer o2){
            return o2-o1;
        }
    });

    public void Insert(Integer num) {
        if(count%2==0){
            maxHeap.offer(num);
            int maxNum = maxHeap.poll();
            minHeap.offer(maxNum);
        }else{
            minHeap.offer(num);
            int minNum = minHeap.poll();
            maxHeap.offer(minNum);
        }
        count++;
    }

    public Double GetMedian() {
        if(count%2==0){
            return new Double((minHeap.peek()+maxHeap.peek()))/2;
        }else{
            return new Double(minHeap.peek());
        }
    }
}
