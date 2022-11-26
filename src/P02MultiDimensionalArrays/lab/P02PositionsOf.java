package P02MultiDimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dimensions= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows=dimensions[0];
        int cols=dimensions[1];

        int[][] matrix=new int[rows][cols];

        for (int r = 0; r < matrix.length ; r++) {
            matrix[r]=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int wantedNumber=Integer.parseInt(scanner.nextLine());

        boolean isFound=false;
        for (int r = 0; r < matrix.length; r++) {
            int[] currentArr=matrix[r];

            for (int c = 0; c < currentArr.length; c++) {
                int number=currentArr[c];
                if (number==wantedNumber){
                    System.out.println(r+" "+c);
                    isFound=true;
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }
    }
}
