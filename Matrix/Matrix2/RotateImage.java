package Matrix.Matrix2;
import java.util.*;
public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
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
