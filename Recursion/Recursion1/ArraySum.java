package Recursion.Recursion1;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr={3,4,6,1,3,8,10};
        System.out.println(arraySum(arr));
    }
    private static int arraySum(int arr[]) {
        // code here
        return findSum(0,arr,0);
    }
    private static int findSum(int i,int[] arr,int sum){
        if(i==arr.length){
            return sum;
        }
        sum+=arr[i];
        return findSum(i+1,arr,sum);
    }
}
