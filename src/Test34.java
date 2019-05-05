import java.util.HashMap;

public class Test34 {
    HashMap<Character,Integer> hashMap = new HashMap<>();
    public int FirstNotRepeatingChar(String str) {
        if(str == null){
            return -1;
        }
        int length = str.length();
        for(int i=0;i<length;i++){
            if(hashMap.containsKey(str.charAt(i))){
                int value = hashMap.get(str.charAt(i));
                hashMap.put(str.charAt(i),++value);
            }else{
                hashMap.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<length;i++){
            if(hashMap.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
