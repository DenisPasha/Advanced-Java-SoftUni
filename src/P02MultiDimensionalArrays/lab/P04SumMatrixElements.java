package P02MultiDimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]dimensions= Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int rowsDimension=dimensions[0];
        int colsDimension=dimensions[1];
        int[][] matrix=new int[rowsDimension][colsDimension];


        for (int rows = 0; rows < matrix.length; rows++) {
            matrix[rows]= Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        int matrixRows=0;
        int matrixCols=0;
        int sum=0;

        for (int[] ints : matrix) {
            matrixRows++;
            for (int anInt : ints) {
                matrixCols++;
                sum += anInt;
            }
        }

        System.out.println(matrixRows);
        System.out.println(matrixCols/matrixRows);

        System.out.println(sum);
    }
}
