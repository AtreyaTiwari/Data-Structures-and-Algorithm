package Matrix.Matrix1;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
            int n=matrix[0].length;
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<m;i++){
                for(int j=i;j<n-i && list.size() != m*n;j++){list.add(matrix[i][j]);}
                for(int j=i+1;j<m-i && list.size() != m*n;j++){list.add(matrix[j][n-i-1]);}
                for(int j=n-i-2;j>=i && list.size() != m*n;j--){list.add(matrix[m-i-1][j]);}
                for(int j=m-i-2;j>=i+1 && list.size() != m*n;j--){list.add(matrix[j][i]);}
                
            }
            return list;
    }
}
