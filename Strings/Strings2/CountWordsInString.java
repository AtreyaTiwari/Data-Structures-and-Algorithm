package Strings.Strings2;

import java.util.Scanner;

public class CountWordsInString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input String");
        String s=in.nextLine();
        System.out.println(s);
        System.out.println(countWords(s));
    }
    private static int countWords(String s){
        if(s==null || s.isEmpty()){
            return 0;
        }
            boolean inWord=false;
            int count=0;
            int n=s.length();
            for(int i=0;i<n;i++){
                char c=s.charAt(i);
                
                if(c==' '){
                    inWord=false;
                }else if(c=='\\'){
                    if(i+1<n && (s.charAt(i+1)=='n' || s.charAt(i+1)=='t')){
                        inWord=false;
                        i++;
                    }
                }else if(!inWord){
                    count++;
                    inWord=true;
                }
            }
        return count;
    }
}
