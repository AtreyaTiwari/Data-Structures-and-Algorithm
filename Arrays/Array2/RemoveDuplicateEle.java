//leetcode 26
package Arrays.Array2;
import java.util.*;
public class RemoveDuplicateEle {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        
    }
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int k=1;k<nums.length;k++){
            if(nums[k]!=nums[i]){
                i++;
                nums[i]=nums[k];
            }
        }
        return i+1;
    }
}
