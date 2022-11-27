package P02MultiDimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05Matrixshuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dimensions= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rowD=dimensions[0];
        int colD=dimensions[1];
        String[][] matrix=new String[rowD][colD];

       matrix=fillMatrix(matrix,scanner);

       String[]commandArr=scanner.nextLine().split(" ");
       while (!commandArr[0].equals("END")) {
           boolean isValid = commandValidation(commandArr, rowD, colD);

           if (isValid) {
               matrix=swap(matrix,commandArr);
               for (String[] strings : matrix) {
                   for (String string : strings) {
                       System.out.print(string + " ");
                   }
                   System.out.println();
               }
           } else {
               System.out.println("Invalid input!");
           }

           commandArr=scanner.nextLine().split(" ");
       }

    }

    private static String[][] swap(String[][] matrix, String[] commandArr) {
        int row1= Integer.parseInt(commandArr[1]);
        int col1= Integer.parseInt(commandArr[2]);
        int row2= Integer.parseInt(commandArr[3]);
        int col2= Integer.parseInt(commandArr[4]);

       String swapThis=matrix[row1][col1];
       String swapToThis=matrix[row2][col2];

       matrix[row1][col1]=swapToThis;
       matrix[row2][col2]=swapThis;

       return matrix;

    }

    private static boolean commandValidation(String[] commandArr, int rowD, int colD) {
        if (commandArr.length==5 && commandArr[0].equals("swap")){
            int row1= Integer.parseInt(commandArr[1]);
            int col1= Integer.parseInt(commandArr[2]);
            int row2= Integer.parseInt(commandArr[3]);
            int col2= Integer.parseInt(commandArr[4]);

            return row1 >= 0 && row1 < rowD && row2 >= 0 && row2 < rowD
                    && col1 >= 0 && col1 < colD && col2 >= 0 && col2 < colD;
        }return false;
    }

    private static String[][] fillMatrix(String[][] matrix, Scanner scanner) {

        for (int r = 0; r < matrix.length; r++) {
                matrix[r]= scanner.nextLine().split(" ");
        }
        return matrix;
    }
}
