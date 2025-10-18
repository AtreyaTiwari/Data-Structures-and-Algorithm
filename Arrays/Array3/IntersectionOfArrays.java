package Arrays.Array3;
import java.util.*;
public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ans=intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
    private static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        HashSet<Integer> resSet=new HashSet<>();
        for(int num:nums2){
            if(set.contains(num)){
                resSet.add(num);
            }
        }
        int[] ans=new int[resSet.size()];
        int i=0;
        for(int num:resSet){
            ans[i++]=num;
        }
        return ans;
    }
}
