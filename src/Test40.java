//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length<2){
            num1[0]=array[0];
            num2[0]=array[1];
            return;
        }
        num1[0]=0;
        num2[0]=0;
        int bitRes = 0;
        for(int i=0;i<array.length;i++){
            bitRes ^= array[i];
        }
        int x = findFirst1(bitRes);
        for(int i=0;i<array.length;i++){
            if(isBit1(array[i],x)){
                num1[0] ^= array[i];
            }else{
                num2[0] ^= array[i];
            }
        }

    }

    public int findFirst1(int num){
        int index=0;
        while(index<=32&&(num&1)==0){
            index++;
        }
        return index;
    }
    public boolean isBit1(int target,int index){
        return ((target >> index)&1)==1;
    }
}