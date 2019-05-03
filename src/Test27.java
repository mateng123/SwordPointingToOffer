import java.util.ArrayList;
import java.util.Collections;

public class Test27 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if(str!=null&&str.length()>0){
            PermutationHelper(str.toCharArray(),0,res);
            Collections.sort(res);
        }
        return res;
    }

    public void PermutationHelper(char cs[],int i,ArrayList<String> list){
        if(i==cs.length-1){
            String val = String.valueOf(cs);
            if(!list.contains(val)){
                list.add(val);
            }
        }else{
            for(int j=i;j<cs.length;j++){
                swap(cs,i,j);
                PermutationHelper(cs,i+1,list);
                swap(cs,j,i);
            }
        }
    }

    public void swap(char cs[],int i,int j ){
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
}
