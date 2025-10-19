package Arrays.Array3;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int prod=1;
        int n = nums.length;
        // Left to right
        for (int i = 0; i < n; i++) {
            prod *= nums[i];
            max = Math.max(max, prod);
            if (prod == 0) prod = 1;
        }
        
        // Reset and go right to left
        prod = 1;
        for (int i = n - 1; i >= 0; i--) {
            prod *= nums[i];
            max = Math.max(max, prod);
            if (prod == 0) prod = 1;
        }
        return max;
    }
}
