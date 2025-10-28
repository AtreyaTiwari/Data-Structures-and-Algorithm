package Strings.Strings2;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String s= "testsampleforcode";
        System.out.println(getMaxOccuringChar( s));
    }   
    public static char getMaxOccuringChar(String s) {
       
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
        }
        int maxInd=-1,maxVal=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i]>maxVal){
                maxInd=i;
                maxVal=freq[i];
            }
        }
        
        return (char)('a'+maxInd);
    }
}
