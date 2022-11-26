package P02MultiDimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows=Integer.parseInt(scanner.nextLine());

        //initialising original matrix
        int[][] matrix=new int[rows][];
        for (int eachArray = 0; eachArray < matrix.length; eachArray++) {
            matrix[eachArray]= streamArrFromScanner(scanner);
        }

       int[] indexes = streamArrFromScanner(scanner);
        int rowOfNum=indexes[0];
        int colOfNum=indexes[1];
        int valueToReplace = matrix[rowOfNum][colOfNum];


        // getting columns count;
        int colCounter=getRowCount(matrix,rows);


        int[][]matrixMod=new int[rows][colCounter];

        // checking and initialising modMatrix
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                int currentNum=matrix[r][c];

                boolean isReplaced=false;
                if (currentNum==valueToReplace){
                    isReplaced=true;

                    int sumForReplacement=getReplacementSum(matrix,r,c,valueToReplace);
                    matrixMod[r][c] = sumForReplacement;

                }

                if (!isReplaced){
                   matrixMod[r][c]=matrix[r][c];
                }
            }
        }
        //printing on console
        for (int rowss = 0; rowss < matrixMod.length; rowss++) {
            for (int cols = 0; cols < matrix[rowss].length; cols++) {
                int currentNum=matrixMod[rowss][cols];
                System.out.print(currentNum+" ");
            }
            System.out.println();
        }

    }




    private static int getReplacementSum(int[][] matrix, int r, int c, int valueToReplace) {
        int sumForReplacement=0;
        if (r > 0 ){
            int up=matrix[r-1][c];
            if (up!=valueToReplace){
                sumForReplacement+=up;
            }
        }
        if (r < matrix.length-1){
            int down=matrix[r+1][c];
            if (down!=valueToReplace){
                sumForReplacement+=down;
            }
        }
        if (c > 0){
            int left=matrix[r][c-1];
            if (left!=valueToReplace){
                sumForReplacement+=left;
            }
        }
        if (c < matrix[r].length-1){
            int right=matrix[r][c+1];
            if (right!=valueToReplace){
                sumForReplacement+=right;
            }

        }
        return sumForReplacement;
    }

    private static int getRowCount(int[][] matrix, int rows) {
        int colCounter=0;
        for (int[] ints : matrix) {
            for (int c = 0; c < ints.length; c++) {
                colCounter++;
            }
        }
       return colCounter = colCounter / rows;

    }

    private static int[] streamArrFromScanner(Scanner scanner) {
       return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

}
