import java.util.ArrayList;

public class Test13 {
    public void reOrderArray(int [] array) {
        int length = array.length;
        ArrayList<Integer> arrayList1 = new ArrayList<>(length);
        ArrayList<Integer> arrayList2 = new ArrayList<>(length);
        for(int i=0;i<length;i++){
            if(array[i]%2==0){
                arrayList1.add(array[i]);
            }else {
                arrayList2.add(array[i]);
            }
        }

        int j=0;
        for (int num : arrayList2) {
            array[j++]=num;
        }
        for (int num:arrayList1){
            array[j++]=num;
        }
    }
}
