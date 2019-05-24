public class Test45 {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length<5){
            return false;
        }
        int min = 15;
        int max = -1;
        int[] b = new int[15];
        for(int i=1;i<15;i++){
            b[i] = 0;
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                continue;
            }
            b[numbers[i]] += 1;
            if(numbers[i]>max){
                max = numbers[i];
            }
            if(numbers[i]<min){
                min = numbers[i];
            }

        }
        for(int i=1;i<15;i++){
            if(b[i]>=2){
                return false;
            }
        }
        if(max-min<5){
            return true;
        }
        return false;
    }
}
