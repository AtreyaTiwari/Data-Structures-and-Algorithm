package Matrix.Matrix1;

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.println(searchMatrix(matrix, target));
    }
    public static boolean searchMatrix(int[][] nums, int target) {
        // int row=nums.length, col=nums[0].length;

        for(int[] arr:nums){
            if(arr[0]<=target && arr[arr.length-1]>=target){
                return binarySearch(arr,target);
            }
        }
        return false;
    }
    private static boolean binarySearch(int[] arr,int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low + (high-low)/2;

            if(arr[mid]==target){
                return true;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
}
