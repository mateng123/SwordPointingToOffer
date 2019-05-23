import java.util.ArrayList;

public class Test41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int left =1,right=2;
        while(right>left){
            int num = (right + left)*(right-left+1)/2;
            if(num==sum){
                ArrayList list = new ArrayList<>();
                for(int i=left;i<=right;i++){
                    list.add(i);
                }
                res.add(list);
                left++;
            }else if(num>sum){
                left++;
            }else{
                right++;
            }

        }
        return res;
    }
}
