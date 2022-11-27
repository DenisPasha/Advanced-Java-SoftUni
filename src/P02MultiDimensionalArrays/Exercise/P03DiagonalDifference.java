package P02MultiDimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        int[][] matrix=new int[n][n];
        matrix=fillMatrix(matrix,scanner);

        int primaryDiagonal=getPrimarySum(matrix);
        int secondaryDiagonal=getSecondarySum(matrix);

        int result=Math.abs(primaryDiagonal-secondaryDiagonal);
        System.out.println(result);

    }

    private static int getSecondarySum(int[][] matrix) {

        int sum=0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (c==matrix.length-r-1){
                    sum+=matrix[r][c];
                }
            }
        }
        return sum;
    }

    private static int getPrimarySum(int[][] matrix) {

        int sum=0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (r==c){
                    sum+=matrix[r][c];
                }
            }
        }
        return sum;
    }

    private static int[][] fillMatrix(int[][] matrix, Scanner scanner) {
        for (int r = 0; r < matrix.length; r++) {
                matrix[r]= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        }
        return matrix;
    }
}
