package P02MultiDimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06PrintDiagonalsofSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        int[][]matrix=new int[n][n];

        for (int i = 0; i < matrix.length ; i++) {
            matrix[i]= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int r = 0; r < matrix.length; r++) {

                System.out.print(matrix[r][r]);
                System.out.print(" ");
        }

        System.out.println();
        for (int r = matrix.length-1; r >=0 ; r--) {

                System.out.print(matrix[r][r]);
                System.out.print(" ");

        }
    }
}
