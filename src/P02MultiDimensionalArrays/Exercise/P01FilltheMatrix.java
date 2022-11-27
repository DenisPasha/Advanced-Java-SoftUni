package P02MultiDimensionalArrays.Exercise;

import java.util.Scanner;

public class P01FilltheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input=scanner.nextLine().split(", ");

        int dimension= Integer.parseInt(input[0]);
        String pattern=input[1];
        int [][]matrix=new int[dimension][dimension];


        if (pattern.equals("A")){
            fillTheMatrixPatternA(matrix);
        } else if (pattern.equals("B")) {
            fillTheMatrixB(matrix);
        }

        printMatrix(matrix);

        
    }

    private static void fillTheMatrixB(int[][] matrix) {
        int counter=1;
        for (int c = 0; c < matrix.length; c++) {

            if (c % 2!=0){
                for (int r = matrix.length-1; r >=0 ; r--) {
                    matrix[r][c]=counter;
                    counter++;
                }
            }else {
                for (int r = 0; r < matrix.length; r++) {
                    matrix[r][c]=counter;
                    counter++;
                }
            }
        }

    }

    private static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
    }

    private static void fillTheMatrixPatternA(int[][] matrix) {

        int counter=1;
        for (int c = 0; c < matrix.length; c++) {
            for (int r = 0; r < matrix.length; r++) {
                matrix[r][c]=counter;
                counter++;
            }
        }
    }
}
