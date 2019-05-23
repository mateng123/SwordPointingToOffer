public class Test43 {
    public String LeftRotateString(String str,int n) {
        StringBuffer sb = new StringBuffer(str);
        sb.append(sb.substring(n,sb.length()));
        return sb.substring(n,sb.length()).toString();
    }
}
