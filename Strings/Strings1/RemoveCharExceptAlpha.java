package Strings.Strings1;

public class RemoveCharExceptAlpha {
    public static void main(String[] args) {
        String  S = "$Gee*k;s..fo, r'Ge^eks?";
        System.out.println(removeSpecialCharacter(S));
    }
    private static String removeSpecialCharacter(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        char[] str=s.toCharArray();
        for(char c:str){
            if(((int)c>=97 && (int)c<=122) || ((int)c>=65 && (int)c<=90)){
                sb.append(c);
            }
        }
        if(sb.isEmpty()) return "-1";
        return sb.toString();
    }
}
