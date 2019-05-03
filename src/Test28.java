public class Test28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==0){
            return 0;
        }
        int res = array[0];
        int time =1;
        for(int i=1;i<array.length;i++){
            if(time==0){
            res = array[i];
            time++;
        }else if(array[i]==res){
            time++;
    }else{
        time--;
    }
}
    time =0;
            for(int i=0;i<array.length;i++){
        if(res == array[i]){
        time++;
        }
        }
        if(time>array.length/2){
        return res;

        }else{
        return 0;
        }
        }
}
