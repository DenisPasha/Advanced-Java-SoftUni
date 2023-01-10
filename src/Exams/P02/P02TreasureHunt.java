package Exams.P02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int initialRows = dimensions[0];
        int initialCols = dimensions[1];

        String[][] matrix = new String[initialRows][initialCols];

        for (int mRows = 0; mRows < initialRows; mRows++) {
            matrix[mRows] = scanner.nextLine().split(" ");
        }

        int myRow = 0;
        int myCol = 0;

        for (int r = 0; r < initialRows; r++) {
            for (int c = 0; c < initialCols; c++) {
                if (matrix[r][c] .equals("Y")){
                    myRow = r;
                    myCol = c;
                }
            }
        }

        List<String>directionsList = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("Finish")){

            switch (command){
                case "up":
                    if (myRow - 1 >= 0){
                        if (!matrix[myRow-1][myCol].equals("T")){
                            myRow = myRow - 1;
                            directionsList.add("up");
                        }else {
                            continue;
                        }
                    }else {
                        myRow = 0;
                    }
                    break;
                case "down":
                    if (myRow + 1  < initialRows){
                        if (!matrix[myRow+1][myCol].equals("T")){
                            myRow = myRow + 1;
                            directionsList.add("down");
                        }else {
                            continue;
                        }
                    }else {
                        myRow = initialRows-1;
                    }
                    break;
                case "left":
                    if (myCol - 1 >= 0){
                        if (!matrix[myRow][myCol - 1].equals("T")){
                            myCol = myCol - 1;
                            directionsList.add("left");
                        }else {
                            continue;
                        }
                    }else {
                        myCol = 0;
                    }
                    break;
                case "right":
                    if (myCol + 1 < initialCols){
                        if (!matrix[myRow][myCol + 1].equals("T")){
                            myCol = myCol + 1;
                            directionsList.add("right");
                        }else {
                            continue;
                        }
                    }else {
                        myCol = initialCols-1;
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        if (matrix[myRow][myCol].equals("X")){
            String directions = String.format("%s",String.join(", ",directionsList));

            System.out.println("I've found the treasure!");
            System.out.printf("The right path is %s",directions);
        }else {
            System.out.println("The map is fake!");
        }
    }
}
