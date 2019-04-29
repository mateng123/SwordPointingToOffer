public class Test06 {
    public int minNumberInRotateArray(int [] array) {
        int length = array.length-1;
        int left = 0;
        int right = length;
        while(right>left){
            int mid = (left+right)/2;
            if(array[right]<array[mid]){
                left=mid+1;
            }else if(array[right]==array[left]){
                right--;
            }else{
                right = mid;
            }
        }
        return array[left];
    }
}
