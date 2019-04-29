public class Test07 {

//    //递归解法
//    public int Fibonacci(int n) {
//        if(n==0) return 0;
//        if(n==1) return 1;
//        return Fibonacci(n-1)+Fibonacci(n-2);
//    }

    //循环解法
    public int Fibonacci(int n) {
        if (n==0) return 0;
        if (n==1) return 1;

        int res=0;
        int preNum = 1;
        int prePreNum = 0;
        for (int i=2;i<=n;i++){
            res = preNum+prePreNum;
            prePreNum = preNum;
            preNum = res;
        }
        return res;
    }
}
