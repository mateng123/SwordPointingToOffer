import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Test29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        int length = input.length;
        if(k<=0||k>length){
            return res;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        });
        for(int i=0;i<length;i++){
            if(i<k){
                maxHeap.offer(input[i]);
            }else if(maxHeap.peek()>input[i]){
                maxHeap.poll();
                maxHeap.offer(input[i]);
            }
        }
        for(Integer e:maxHeap){
            res.add(e);
        }
        return res;
    }
}
