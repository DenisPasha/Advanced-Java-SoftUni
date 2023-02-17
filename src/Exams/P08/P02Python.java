package Exams.P08;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class P02Python {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];

        String[] commandsArr = scanner.nextLine().split(", ");


        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = scanner.nextLine().split(" ");
        }

        int pythonRow = -1;
        int pythonCol = -1;

        int eatenFood = 1;
        int footToBeEaten = 0;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                if (matrix[r][c].equals("s")){
                    pythonRow = r;
                    pythonCol = c;
                } else if (matrix[r][c].equals("f")) {
                    footToBeEaten++;
                }
            }
        }



        for (int i = 0; i < commandsArr.length; i++) {
            String currentCommand = commandsArr[i];
            switch (currentCommand){
                case "up":
                    pythonRow = pythonRow - 1;
                    if (pythonRow < 0){
                        pythonRow = matrix.length - 1;
                    }
                    boolean isDead = pythonDead(matrix, pythonRow, pythonCol, eatenFood);
                    if (isDead){
                        return;
                    }

                    eatenFood = movePython(matrix, pythonRow, pythonCol, eatenFood);
                    break;
                case "down":
                    pythonRow = pythonRow + 1;
                    if (pythonRow > matrix.length - 1){
                        pythonRow = 0;
                    }
                     isDead = pythonDead(matrix, pythonRow, pythonCol, eatenFood);
                    if (isDead){
                        return;
                    }
                    eatenFood = movePython(matrix, pythonRow, pythonCol, eatenFood);
                    break;
                case "left":
                    pythonCol = pythonCol - 1;
                    if (pythonCol < 0){
                        pythonCol = matrix.length - 1;
                    }
                     isDead = pythonDead(matrix, pythonRow, pythonCol, eatenFood);
                    if (isDead){
                        return;
                    }
                    eatenFood = movePython(matrix, pythonRow, pythonCol, eatenFood);
                    break;
                case "right":
                    pythonCol = pythonCol + 1;
                    if (pythonCol > matrix.length - 1){
                        pythonCol = 0;
                    }
                     isDead = pythonDead(matrix, pythonRow, pythonCol, eatenFood);
                    if (isDead){
                        return;
                    }
                    eatenFood = movePython(matrix, pythonRow, pythonCol, eatenFood);
                    break;
            }
        }

        if (eatenFood - footToBeEaten == 1){
            System.out.printf("You win! Final python length is %d%n",eatenFood);
        }else {
            System.out.printf("You lose! There is still %d food to be eaten.%n",Math.abs(footToBeEaten - 1 - eatenFood) );
        }
    }

    private static int movePython(String[][] matrix, int pythonRow, int pythonCol, int eatenFood) {
        if (matrix[pythonRow][pythonCol].equals("f")) {
            eatenFood++;
        }
        return eatenFood;
    }

    public static boolean pythonDead (String[][] matrix, int pythonRow, int pythonCol, int eatenFood){
        if (matrix[pythonRow][pythonCol] .equals("e")){
            System.out.println("You lose! Killed by an enemy!");
            return true;
        }
        return false;
    }
}
