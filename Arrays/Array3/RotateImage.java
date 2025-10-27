package Arrays.Array3;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        //invert
        for(int j=0;j<m;j++){
            for(int i=0;i<n/2;i++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-i-1][j];
                matrix[n-1-i][j]=temp;
            }
        }
        //swap
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
