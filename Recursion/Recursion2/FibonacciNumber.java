package Recursion.Recursion2;

public class FibonacciNumber {
    public static void main(String[] args) {
        int  n=5;
        System.out.println(nthFibonacci(n));
    }
    public static int nthFibonacci(int n) {
        if(n<=1) return n;
        return nthFibonacci(n-1)+nthFibonacci(n-2);
    }
}
