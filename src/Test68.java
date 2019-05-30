public class Test68 {
    public int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] flag = new boolean[rows][cols];
        return judje(0,0,threshold,rows,cols,flag);
    }

    public int judje(int i,int j,int k,int rows,int cols,boolean[][] flag){
        if(i<0||j<0||i>=rows||j>=cols||helper(i,j)>k||flag[i][j]==true){
            return 0;
        }
        flag[i][j]=true;
        return judje(i+1,j,k,rows,cols,flag)+judje(i-1,j,k,rows,cols,flag)
                +judje(i,j+1,k,rows,cols,flag)+judje(i,j-1,k,rows,cols,flag)+1;
    }

    public int helper(int rows,int cols){
        int count=0;
        while(rows>0||cols>0){
            count = count+rows%10+cols%10;
            rows /= 10;
            cols /= 10;
        }
        return count;
    }
}
