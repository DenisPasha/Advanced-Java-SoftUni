package P02MultiDimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows=dimensions[0];
        int cols=dimensions[1];

        int[][]matrix=new int[rows][cols];
        matrix=fillTheMatrix(matrix,scanner);
        int[][]modMatrix=new int[3][3];
        int [] array=new int[9];

        int max=Integer.MIN_VALUE;

        for (int r = 0; r < matrix.length-2; r++) {

            for (int c = 0; c < matrix[r].length-2; c++) {
                int sum=0;
                array[0]=matrix[r][c];
                array[1]=matrix[r][c+1];
                array[2]=matrix[r][c+2];
                array[3]=matrix[r+1][c];
                array[4]=matrix[r+1][c+1];
                array[5]=matrix[r+1][c+2];
                array[6]=matrix[r+2][c];
                array[7]=matrix[r+2][c+1];
                array[8]=matrix[r+2][c+2];

                sum=calculateSumOfMatrix(array);

                if (sum > max){
                    max=sum;
                    modMatrix=updateMatrix3by3(modMatrix,array);
                }
            }
        }

        printMatrix(modMatrix,max);

    }

    private static int calculateSumOfMatrix(int[] array) {
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
        }
        return sum;
    }

    private static int[][] updateMatrix3by3(int[][] modMatrix, int[] array) {
        boolean isUpdated=false;
        for (int row = 0; row < modMatrix.length; row++) {
            for (int col = 0; col < modMatrix[row].length; col++) {
                modMatrix[row][col]=array[0];
                modMatrix[row][col+1]=array[1];
                modMatrix[row][col+2]=array[2];
                modMatrix[row+1][col]=array[3];
                modMatrix[row+1][col+1]=array[4];
                modMatrix[row+1][col+2]=array[5];
                modMatrix[row+2][col]=array[6];
                modMatrix[row+2][col+1]=array[7];
                modMatrix[row+2][col+2]=array[8];
                isUpdated=true;
                break;
            }
            if (isUpdated){
                break;
            }
        }
        return modMatrix;

    }

    private static void printMatrix(int[][] modMatrix, int max) {
        System.out.printf("Sum = %d%n",max);
        for (int r = 0; r < modMatrix.length; r++) {
            for (int c = 0; c < modMatrix[r].length; c++) {
                System.out.print(modMatrix[r][c]+" ");
            }
            System.out.println();
        }

    }

    private static int[][] fillTheMatrix(int[][] matrix, Scanner scanner) {

        for (int r = 0; r < matrix.length; r++) {
            matrix[r]=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
