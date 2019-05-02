import java.util.Stack;

public class Test21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(popA==null||pushA==null||pushA.length!=popA.length){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int length = pushA.length;
        int i=0,j=0;
        while(j<length){
            stack.push(pushA[j++]);
            while(!stack.isEmpty()&&stack.peek()==popA[i]){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
