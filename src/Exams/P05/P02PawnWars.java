package Exams.P05;

import java.util.Scanner;

public class P02PawnWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][8];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }

        int whiteRow = -1;
        int whiteCol = -1;

        int blackRow = -1;
        int blackCol = -1;


        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                if (matrix[r][c] .equals("b") ){
                    blackRow = r;
                    blackCol = c;
                } else if (matrix[r][c] .equals("w")){
                    whiteRow = r;
                    whiteCol = c;
                }
            }
        }

        char whitePosition = findPosition(whiteCol);
        char blackPosition = findPosition(blackCol);

        while (whiteRow > 0 && blackRow < 7 ){

            if (whiteRow - 1 == blackRow ){
                if (whiteCol + 1 == blackCol || whiteCol - 1 == blackCol){
                    System.out.printf("Game over! White capture on %c%d.%n",blackPosition,8-blackRow);
                    return;
                }
            }
            matrix[whiteRow][whiteCol] = "-";
            matrix[blackRow][blackCol] = "-";

            whiteRow = whiteRow - 1;

            if (whiteRow - 1 == blackRow ){
                if (whiteCol + 1 == blackCol || whiteCol - 1 == blackCol){
                    System.out.printf("Game over! Black capture on %c%d.%n",whitePosition,8-whiteRow);
                    return;
                }
            }

            blackRow = blackRow + 1;

            matrix[whiteRow][whiteCol] = "w";
            matrix[blackRow][blackCol] = "b";

        }


        if (whiteRow == 0){
            System.out.printf("Game over! White pawn is promoted to a queen at %c%d.%n",whitePosition,8);
        } else if (blackRow == 7) {
            System.out.printf("Game over! Black pawn is promoted to a queen at %c%d.%n",blackPosition,1);
        }


    }

    private static char findPosition(int whiteCol) {
        char position = 0;
        switch (whiteCol){
            case 0:
               position = 'a';
                break;
            case 1:
                position = 'b';
                break;
            case 2:
                position = 'c';
                break;
            case 3:
                position = 'd';
                break;
            case 4:
                position = 'e';
                break;
            case 5:
                position = 'f';
                break;
            case 6:
                position = 'g';
                break;
            case 7:
                position = 'h';
                break;

        }
        return position;
    }
}
