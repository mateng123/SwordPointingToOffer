public class Test43 {

//    //使用StringBuilder
//    public String LeftRotateString(String str,int n) {
//        if (str == null || n < 0 || n > str.length()) return "";
//        StringBuilder sb = new StringBuilder(str);
//        sb.append(sb.substring(0,n));
//        return sb.substring(n,sb.length());
//    }

    public String LeftRotateString(String str,int n) {
        if(str==null||str.length()==0) return "";
        if(n>str.length()) n %= str.length();
        char[] chars = str.toCharArray();

        reverse(chars,0,n-1);
        reverse(chars,n,str.length()-1);
        reverse(chars,0,str.length()-1);

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
}
