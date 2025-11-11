package DynamicProgramming;
import  java.util.*;
public class CountBits {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(countBits(n)));
    }
    public static int[] countBits(int n) {
     int[] ans=new int[n+1];
     ans[0]=0;

     for(int i=1;i<ans.length;i++){
        ans[i]=ans[i & (i-1)]+1;
     }   
     return ans;
    }
}
