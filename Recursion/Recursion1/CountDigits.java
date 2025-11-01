package Recursion.Recursion1;

public class CountDigits {
    public static void main(String[] args) {
        int n= 2446;
        System.out.println(evenlyDivides(n));
    }
    private static int evenlyDivides(int n) {
        // code here
         return count(n,0,n);
    }
    private static int count(int N,int c,int n){
        if(n<=0){
            return c;
        }
        int dig=n%10;
        if(dig!=0 && N%dig==0){
            c++;
        }
        return count(N,c,n/10);
        
    }
}
