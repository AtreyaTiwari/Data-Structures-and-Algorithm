package Strings.Strings1;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {

        int left=0;
        int right=s.length() -1;

        while(left<right){
            char a = s.charAt(left);
            char b = s.charAt(right);

            //uppercase to lowercase
            if(a>='A' && a<='Z') a=(char)(a+32);
            if(b>='A' && b<='Z') b=(char)(b+32);

            if(!((a>='a' && a<='z') || (a>='0' && a<='9'))){
                left++;
                continue;
            }
            
            if(!((b>='a' && b<='z') || (b>='0' && b<='9'))){
                right--;
                continue;
            }

            if(a!=b){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
