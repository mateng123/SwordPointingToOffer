public class Test30 {
//    //普通算法
//    public int FindGreatestSumOfSubArray(int[] array) {
//        if(array.length==0){
//            return 0;
//        }
//
//        int res = array[0];
//        int curSum = array[0];
//        for(int i=1;i<array.length;i++){
//            if(curSum<=0){
//                curSum = array[i];
//            }else{
//                curSum += array[i];
//            }
//            if(curSum>res){
//                res = curSum;
//            }
//        }
//        return res;
//    }

    //动态规划
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0){
            return 0;
        }
        int res = array[0];
        int max = array[0];
        for(int i=1;i<array.length;i++){
            max = Math.max(array[i],max+array[i]);
            res = Math.max(res,max);
        }
        return res;
    }
}
