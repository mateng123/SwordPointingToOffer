public class Test46 {
    public int LastRemaining_Solution(int n, int m) {
        if(n<1||m<1) return -1;
        int[] a = new int[n];
        int i=-1,count =n,step=0;
        while(count>0){
            i++;
            if(i>=n) i=0;
            if(a[i]==-1) continue;
            step++;
            if(step==m){
                step=0;
                a[i]=-1;
                count--;
            }
        }
        return i;
    }
}
