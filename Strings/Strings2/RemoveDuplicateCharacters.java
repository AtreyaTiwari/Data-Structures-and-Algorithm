package Strings.Strings2;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String s="HaPpyNewYear";
        System.out.println(remove(s));
    }
    private static String remove(String s){
        int[] freq=new int[123];
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            freq[c]++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(freq[c]>0){
                sb.append(c);
                freq[c]=0;
            }
        }
        return sb.toString();
    }
}
