import java.util.ArrayList;

public class Test42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int left=0,right=array.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || array.length < 2) {
            return list;
        }
        while(right>left){
            if(array[left]+array[right]==sum){
                list.add(array[left]);
                list.add(array[right]);
                return list;
            }else if(array[left]+array[right]>sum){
                right--;
            }else{
                left++;
            }
        }
        return list;
    }
}
