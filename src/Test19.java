import java.util.ArrayList;

public class Test19 {
    ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int col = matrix[0].length-1;
        int row = matrix.length-1;
        int tR = 0;
        int tC = 0;
        while(tR<=row&&tC<=col){
            printEdge(matrix,tR++,tC++,row--,col--);
        }
        return res;
    }

    public void printEdge(int [][]matrix,int tR,int tC,int row,int col){
        if(tR==row){
            while(tC<=col)
                res.add(matrix[tR][tC++]);
        }else if(tC==col){
            while(tR<=row)
                res.add(matrix[tR++][tC]);
        }else{
            int CurC = tC;
            int CurR = tR;
            while(CurC<col){
                res.add(matrix[CurR][CurC++]);
            }
            while(CurR<row){
                res.add(matrix[CurR++][CurC]);
            }
            while(CurC>tC){
                res.add(matrix[CurR][CurC--]);
            }
            while(CurR>tR){
                res.add(matrix[CurR--][CurC]);
            }
        }
    }
}
