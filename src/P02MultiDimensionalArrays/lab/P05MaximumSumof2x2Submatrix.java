package P02MultiDimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05MaximumSumof2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions= Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows=dimensions[0];
        int cols=dimensions[1];

        int[][] matrix=new int[rows][cols];

        for (int i = 0; i < matrix.length ; i++) {
            matrix[i]= Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        int[][] matrix2by2=new int[2][2];
        int sum=0;

        for (int r = 0; r < matrix.length-1 ; r++) {
            for (int c = 0; c < matrix[r].length-1; c++) {

                int currentSum=0;
                int one=matrix[r][c];
                int two=matrix[r][c+1];

                int tree=matrix [r+1][c];
                int four=matrix [r+1][c+1];


                currentSum=one+tree+two+four;
                if (currentSum>sum){
                    sum=currentSum;

                    matrix2by2[0][0]=one;
                    matrix2by2[0][1]=two;
                    matrix2by2[1][0]=tree;
                    matrix2by2[1][1]=four;
                }

            }
        }

        for (int[] currentArr : matrix2by2) {
            for (int current : currentArr) {
                System.out.print(current + " ");
            }
            System.out.println();
        }
        System.out.println(sum);

    }
}
