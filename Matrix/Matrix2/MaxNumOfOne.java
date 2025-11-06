package Matrix.Matrix2;
import java.util.*;
public class MaxNumOfOne {
    public static void main(String[] args) {
        int[][] mat={{0,0,0},{0,1,1}};
        System.out.println(Arrays.toString(rowAndMaximumOnes(mat)));
    }
    private static int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans=new int[2];
        int n=mat.length;
        int m=mat[0].length;
        int maxCount=0,maxInd=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1) count++;
            }
            if(maxCount<count){
                maxCount=count;
                maxInd=i;
            }
        }
        ans[0]=maxInd;
        ans[1]=maxCount;
        return ans;
    }
}
