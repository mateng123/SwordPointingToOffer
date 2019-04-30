public class Test12 {

//    //O(n)
//    public double Power(double base, int exponent) {
//        double result = 1;
//        for(int i=0;i<Math.abs(exponent);i++){
//            result *= base;
//        }
//        if(exponent<0){
//            result = 1/result;
//        }
//        return result;
//    }

    //O(log(n))
    public double Power(double base, int exponent) {
        double result = 1;
        int n = 0;
        if(exponent>0){
            n=exponent;
        }else if(exponent<0){
            n = -exponent;
        }else{
            return 1;
        }

        while(n!=0){
            if((n&1)==1){
                result *= base;
            }
            base *= base;
            n=n>>1;
        }
        return exponent>=0?result:1/result;
    }
}
