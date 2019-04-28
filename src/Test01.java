

public class Test01 {
    public boolean Find(int target, int [][] array) {
        int right = array.length-1;
        int bottom = array[0].length-1;
        int x = right>bottom ?right : bottom;

        boolean isHave = false;
        for (int i=bottom,j=0;i>=0&&j<=right;){
            if (array[i][j]==target)
                return true;
            if (array[i][j]>target){
                i--;
                continue;
            }
            if (target>array[i][j]){
                j++;
                continue;
            }
        }
        return false;
    }
}
