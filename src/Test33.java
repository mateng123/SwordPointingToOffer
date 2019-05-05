public class Test33 {
    public int GetUglyNumber_Solution(int index) {
        if(index<6){
            return index;
        }
        int[] res = new int[index];
        res[0]=1;
        int t2 = 0,t3 =0,t5=0;
        int i=1;
        while(i<index){
            res[i] = min(min(res[t2]*2,res[t3]*3),res[t5]*5);
            if(res[i] == res[t2]*2) t2++;
            if(res[i] == res[t3]*3) t3++;
            if(res[i] == res[t5]*5) t5++;
            i++;
        }
        return res[i-1];
    }

    public int min(int a,int b){
        return a<b?a:b;
    }
}
