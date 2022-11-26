package P02MultiDimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //matrix one
        int [] dimension= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows=dimension[0];
        int cols=dimension[1];

        int[][] matrixOne=new int[rows][cols];

        matrixOne=initialiseMatrix(scanner,matrixOne);

        //matrix two
        int [] dimension1= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows1=dimension1[0];
        int cols1=dimension1[1];

        int[][] matrixTwo=new int[rows1][cols1];
        matrixTwo=initialiseMatrix(scanner,matrixTwo);

        boolean isEqual=true;
        if (matrixOne.length!=matrixTwo.length){
            isEqual=false;
        }else {
            for (int r = 0; r < matrixOne.length; r++) {
                if (matrixOne[r].length!=matrixTwo[r].length){
                    isEqual=false;
                }else {
                    for (int c = 0; c < matrixOne[r].length; c++) {
                        if (matrixOne[r][c]!=matrixTwo[r][c]){
                            isEqual=false;
                        }
                    }
                }
            }
        }
        System.out.println(isEqual ? "equal" : "not equal");


    }

    private static int[][] initialiseMatrix(Scanner scanner, int[][] matrix) {

        for (int rows = 0; rows < matrix.length ; rows++) {
            matrix[rows]=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        }
        return matrix;
    }
}
