public class Test37 {

    //递归写法
    public int GetNumberOfK(int [] array , int k) {
        int n = array.length;
        if(n==0){
            return 0;
        }
        int res = GetNumberOfK(array,0,n-1,k);
        return res;
    }

    public int GetNumberOfK(int[] array,int l,int r,int k){
        int mid = (r+l)/2;
        if(r==l&&array[r]==k){
            return 1;
        }else if(r==l&&array[r]!=k){
            return 0;
        }else{
            return GetNumberOfK(array,l,mid,k)+GetNumberOfK(array,mid+1,r,k);
        }

    }


}
