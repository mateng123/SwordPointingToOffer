public class Test53 {
    public boolean isNumeric(char[] str) {
        try{
            double re = Double.parseDouble(new String(str));
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
}
