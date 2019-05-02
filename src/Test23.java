public class Test23 {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
            return false;
        }
        return judge(sequence,0,sequence.length-1);
    }

    public boolean judge(int[] seq,int l,int r){
        if(l>=r) return true;
        int i=r-1;
        for(;i>=l;i--){
            if(seq[i]<seq[r]){
                break;
            }
        }
        int j=l;
        for(;j<=i;j++){
            if(seq[j]>seq[r]){
                return false;
            }
        }
        return judge(seq,l,i)&&judge(seq,i+1,r-1);
    }
}
