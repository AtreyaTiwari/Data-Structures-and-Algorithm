package Strings.Strings1;

import java.util.HashSet;
import java.util.Set;

public class CountVowelSubstring {
    public static void main(String[] args) {
        String word = "cuaieuouac";
        System.out.println(countVowelSubstrings(word));
    }
    public static int countVowelSubstrings(String word) {
        int n=word.length();
        int count=0;
        for(int i=0;i<=n-5;i++){
            if(!isVowel(word.charAt(i))) continue;

            Set<Character> set=new HashSet<>();
            for(int j=i;j<n;j++){
                if(!isVowel(word.charAt(j))) break;
                set.add(word.charAt(j));
                if(set.size()==5) count++;
            }

        }
        return count;
    }
    private static boolean isVowel(char ch){
        return "aeiou".indexOf(ch)!=-1;
    }
}
