package Recursion.Recursion1;

public class PrintingIncDec {
    public static void main(String[] args) {
        int n=7;
        print(n);
    }
    private static void print(int n){
        if(n<1){
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
}
