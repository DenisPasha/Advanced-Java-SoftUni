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


        int max=Integer.MIN_VALUE;

        int el1=0;
        int el2=0;
        int el3=0;
        int el4=0;
        int el5=0;
        int el6=0;
        int el7=0;
        int el8=0;
        int el9=0;

        for (int r = 0; r < matrix.length-2; r++) {
            int sum=0;
            for (int c = 0; c < matrix[r].length-2; c++) {
                el1=matrix[r][c];
                el2=matrix[r][c+1];
                el3=matrix[r][c+2];
                el4=matrix[r+1][c];
                el5=matrix[r+1][c+1];
                el6=matrix[r+1][c+2];
                el7=matrix[r+2][c];
                el8=matrix[r+2][c+1];
                el9=matrix[r+2][c+2];

                sum=el1+el2+el3+el4+el5+el6+el7+el8+el9;
                if (sum > max){
                    max=sum;
                    boolean isUpdated=false;
                    for (int row = 0; row < modMatrix.length; row++) {
                        for (int col = 0; col < modMatrix[row].length; col++) {
                            modMatrix[row][col]=el1;
                            modMatrix[row][col+1]=el2;
                            modMatrix[row][col+2]=el3;
                            modMatrix[row+1][col]=el4;
                            modMatrix[row+1][col+1]=el5;
                            modMatrix[row+1][col+2]=el6;
                            modMatrix[row+2][col]=el7;
                            modMatrix[row+2][col+1]=el8;
                            modMatrix[row+2][col+2]=el9;
                            isUpdated=true;
                            break;
                        }
                        if (isUpdated){
                            break;
                        }


                    }
                }

            }

        }

        printMatrix(modMatrix,max);

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
