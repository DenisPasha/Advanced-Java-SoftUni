package P02MultiDimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P02MatrixofPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row=dimensions[0];
        int col=dimensions[1];

        String[][]matrix=new String[row][col];

        fillMatrix(matrix);


    }

    private static void fillMatrix(String[][] matrix) {
        char startingLetter='a';
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                char middle= (char) (startingLetter+c);
                StringBuilder sb=new StringBuilder();
                sb.append(startingLetter);
                sb.append(middle);
                sb.append(startingLetter);

                matrix[r][c] =  sb.toString();
                sb.replace(0,sb.length(),"");
            }
            startingLetter += 1;
        }
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
    }
}
