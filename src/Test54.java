import java.util.*;
public class Test54 {
    HashMap<Character,Integer> map = new HashMap<>();
    LinkedList<Character> list = new LinkedList<>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,1);
            list.add(ch);
        }

    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(char ch:list){
            if(map.get(ch)==1){
                return ch;
            }
        }
        return '#';
    }
}
