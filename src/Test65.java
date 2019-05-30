import java.util.*;
public class Test65 {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<>();
        if (num == null || num.length == 0 || size <= 0 || num.length < size) {
            return res;
        }
        LinkedList<Integer> qmax = new LinkedList<>();
        for(int i=0;i<num.length;i++){
            while(!qmax.isEmpty()&&num[qmax.peekLast()]<num[i]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if(qmax.peekFirst()==i-size){
                qmax.pollFirst();
            }
            if(i>=size-1){
                res.add(num[qmax.peekFirst()]);
            }
        }
        return res;
    }
}
