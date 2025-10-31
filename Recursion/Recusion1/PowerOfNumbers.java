package Recursion.Recusion1;

public class PowerOfNumbers {
    public static void main(String[] args) {
        int n=12;
        System.out.println(reverseExponentiation(n));
    }
    public static int reverseExponentiation(int n) {
        // code here
        int r=rev(n,0);
        return (int)Math.pow(n,r);
    }
    private static int rev(int n,int num){
        if(n<=0){
            return num;
        }
        num= (num*10) + (n%10);
        return rev(n/10,num);
    } 
}
