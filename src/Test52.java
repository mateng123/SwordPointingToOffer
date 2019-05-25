public class Test52 {
    public boolean match(char[] str, char[] pattern)
        {
            if(str==null||pattern==null){
                return false;
            }
            int startStr = 0;
            int startPattern = 0;
            return matchCore(startStr,startPattern,str,pattern);
        }

        public boolean matchCore(int startStr,int startPattern,char[] str,char[] pattern){
            if(startStr==str.length&&startPattern==pattern.length){
                return true;
            }
            if(startStr!=str.length&&startPattern==pattern.length){
                return false;
            }
            if(startPattern+1<pattern.length&&pattern[startPattern+1]=='*'){
                if((startStr!=str.length&&str[startStr]==pattern[startPattern])||(pattern[startPattern]=='.'&&startStr != str.length)){
                    return matchCore(startStr+1,startPattern+2,str,pattern)||
                            matchCore(startStr,startPattern+2,str,pattern)||
                            matchCore(startStr+1,startPattern,str,pattern);
                }else{
                    return matchCore(startStr,startPattern+2,str,pattern);
                }
            }
            if(startStr!=str.length&&str[startStr]==pattern[startPattern]||pattern[startPattern]=='.'){
                return matchCore(startStr+1,startPattern+1,str,pattern);
            }
        return false;
    }
}
