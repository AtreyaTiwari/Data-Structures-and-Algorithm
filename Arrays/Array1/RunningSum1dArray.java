package Arrays.Array1;
import java.util.Arrays;

public class RunningSum1dArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int sum=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            arr[i]=sum;
        }
        return arr;
    }

}