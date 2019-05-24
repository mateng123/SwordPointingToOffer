public class Test44 {
    public String ReverseSentence(String str) {
        if(str==null||str.length()==0){
            return "";
        }
        char[] chars = str.toCharArray();
        reverse(chars,0,str.length()-1);
        int left = -1;
        for(int i=0;i<str.length();i++){
            if(chars[i]==' '){
                int right=i;
                reverse(chars,left+1,right-1);
                left = right;
            }
        }
        reverse(chars,left+1,str.length()-1);
        return new String(chars);
    }
    public void reverse(char[] chars,int left,int right){

        while(right>left){
            char temp = chars[right];
            chars[right] = chars[left];
            chars[left] = temp;
            right--;
            left++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Test44().ReverseSentence("I am a student."));
    }
}
