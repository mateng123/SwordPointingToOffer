public class Test35 {
    int count =0;
    public int InversePairs(int[] array) {
        if(array.length!=0){
            mergeSortUp(array,0,array.length-1);
        }
        return count;
    }

    public void mergeSortUp(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int mid = (left+right)/2;
        mergeSortUp(array,left,mid);
        mergeSortUp(array,mid+1,right);

        merge(array,left,mid,right);
    }


    public void merge(int[] a, int start, int mid, int end) {
        int[] tmp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (a[i] <= a[j])
                tmp[k++] = a[i++];
            else {
                tmp[k++] = a[j++];
                count += mid - i + 1;
                count = count%1000000007;
            }
        }

        while (i <= mid)
            tmp[k++] = a[i++];
        while (j <= end)
            tmp[k++] = a[j++];
        for (k = 0; k < tmp.length; k++)
            a[start + k] = tmp[k];
    }
}
