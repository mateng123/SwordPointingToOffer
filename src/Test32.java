import java.util.Arrays;
import java.util.Comparator;

public class Test32 {
    public String PrintMinNumber(int [] numbers) {
        if(numbers.length==0){
            return "";
        }
        String[] str = new String[numbers.length];
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<numbers.length;i++){
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str,new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                String c1 = s1+s2;
                String c2 = s2+s1;
                //返回值大于0 s1,s2对调
                return c1.compareTo(c2);
            }
        });
        for(int i=0;i<numbers.length;i++){
            sb.append(str[i]);
        }
        return sb.toString();
    }
}
