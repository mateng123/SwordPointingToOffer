public class Test47 {

    public int Sum_Solution(int n) {
        int a = n;
        boolean flag= (a>0)&&((a+=Sum_Solution(a-1))>0);
        return a;
    }

}
