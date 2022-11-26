package P02MultiDimensionalArrays.lab;

import java.util.Scanner;

public class P03IntersectionofTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows=Integer.parseInt(scanner.nextLine());
        int cols=Integer.parseInt(scanner.nextLine());

        char[][] matrixOne=initialiseMatrix(scanner,rows,cols);
        char[][] matrixTwo=initialiseMatrix(scanner,rows,cols);

        char[][] newMatrix=new char[rows][cols];


        for (int r = 0; r < matrixOne.length ; r++) {
            for (int c = 0; c < matrixOne[r].length; c++) {
                if (matrixOne[r][c]==matrixTwo[r][c]){
                    newMatrix[r][c]=matrixOne[r][c];
                }else {
                    newMatrix[r][c]='*';
                }
            }
        }

        for (char[] currentArr : newMatrix) {
            for (char currentSymbol : currentArr) {
                System.out.print(currentSymbol + " ");
            }
            System.out.println();
        }


    }

    private static char[][] initialiseMatrix(Scanner scanner, int rows, int cols) {

        StringBuilder sb=new StringBuilder();
        char[][]matrix=new char[rows][cols];

        for (int i = 0; i < matrix.length; i++) {

            String input=scanner.nextLine();
            for (int j = 0; j <input.length() ; j++) {
                if (input.charAt(j)!=' '){
                    sb.append(input.charAt(j));
                }

            }
            char[] currentArr=sb.toString().toCharArray();
            matrix[i]=currentArr;
            sb.replace(0,sb.length(),"");
        }
        return matrix;
    }
}
