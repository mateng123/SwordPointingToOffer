public class Test50 {

    //占有O(n)的空间
//    public boolean duplicate(int numbers[],int length,int [] duplication) {
//        boolean[] a = new boolean[length];
//        for(int i=0;i<length;i++){
//            if(a[numbers[i]]==true){
//                duplication[0]=numbers[i];
//                return true;
//            }
//            a[numbers[i]]=true;
//        }
//        return false;
//    }

    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if ( numbers==null ) return false;
        for(int i=0;i<length;i++){
            while(i!=numbers[i]){
                if(numbers[i]==numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                }
                int temp = numbers[i];
                numbers[i] = numbers[numbers[i]];
                numbers[temp] = temp;
            }

        }
        return false;
    }
}
