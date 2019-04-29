public class Test02 {
//    public static String replaceSpace(StringBuffer str) {
//        int count = 0;
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==' '){
//                count++;
//            }
//        }
//        int indexOld = str.length()-1;
//        int afterLength = str.length()+count*2;
//        int indexNew = afterLength-1;
//        str.setLength(afterLength);
//        for(;indexOld>=0;indexOld--){
//            if(str.charAt(indexOld)==' '){
//                str.setCharAt(indexNew--,'0');
//                str.setCharAt(indexNew--,'2');
//                str.setCharAt(indexNew--,'%');
//            }else {
//                str.setCharAt(indexNew--,str.charAt(indexOld));
//            }
//        }
//        return str.toString();
//    }

    public static String replaceSpace(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append("%20");

            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(sb));
    }
}
