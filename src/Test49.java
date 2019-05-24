public class Test49 {
    public int StrToInt(String str) {
        if(str==null||str.length()==0) return 0;
        char[] chars = str.toCharArray();
        int flag=1,start=0;
        if(chars[0]=='+'){
            flag=1;
            start=1;
        }else if(chars[0]=='-'){
            flag=0;
            start=1;
        }
        int sum=0;
        for(int i=start;i<chars.length;i++){
            int result;
            if(chars[i]>='0'&&chars[i]<='9'){
                result = sum*10+(int)(chars[i]-'0');
            }else{
                return 0;
            }
            if((result-(int)(chars[i] - '0'))/10!=sum){
                return 0;
            }
            sum = sum*10+(int)(chars[i]-'0');
        }
        if(flag==0){
            sum = sum*(-1);
        }
        return sum;
    }
}
