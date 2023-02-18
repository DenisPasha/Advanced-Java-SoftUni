package Exam2023JavaAdvanced;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class P02BlindMansBuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int inputRows = dimensions[0];
        int inputCols = dimensions[1];

        String[][] matrix = new String[inputRows][inputCols];

        for (int r = 0; r < inputRows; r++) {
            matrix[r] = scanner.nextLine().split(" ");
        }

        int blindManRow = -1;
        int blindManCol = -1;

        int opponentCount = 0;
        int touchedOpponents = 0;
        int movesMade = 0;

        for (int r = 0; r < inputRows; r++) {
            for (int c = 0; c < inputCols; c++) {
                if (matrix[r][c].equals("B")){
                    blindManRow = r;
                    blindManCol = c;
                } else if (matrix[r][c].equals("P")) {
                    opponentCount++;
                }
            }
        }


        String command = scanner.nextLine();
        while (!command.equals("Finish")){

            switch (command){
                case "up":
                    if (blindManRow - 1 < 0){
                        command = scanner.nextLine();
                        continue;
                    }
                   if (matrix[blindManRow - 1][blindManCol].equals("O") ){
                       command = scanner.nextLine();
                       continue;
                   }

                   blindManRow = blindManRow - 1;

                   if (matrix[blindManRow][blindManCol].equals("P")){
                       matrix[blindManRow + 1][blindManCol] = "-";
                       matrix[blindManRow][blindManCol] = "B";
                       touchedOpponents++;
                       movesMade++;

                       if (touchedOpponents == opponentCount){
                           System.out.println("Game over!");
                           System.out.printf("Touched opponents: %d Moves made: %d%n",touchedOpponents,movesMade);
                           return;
                       }

                   } else if (matrix[blindManRow][blindManCol].equals("-")) {
                       matrix[blindManRow + 1][blindManCol] = "-";
                       matrix[blindManRow][blindManCol] = "B";
                       movesMade++;
                   }
                    break;
                case "down":


                    if (blindManRow + 1 > inputRows - 1){
                        command = scanner.nextLine();
                        continue;
                    }
                    if (matrix[blindManRow + 1][blindManCol].equals("O") ){
                        command = scanner.nextLine();
                        continue;
                    }

                    blindManRow = blindManRow + 1;

                    if (matrix[blindManRow][blindManCol].equals("P")){
                        matrix[blindManRow - 1][blindManCol] = "-";
                        matrix[blindManRow][blindManCol] = "B";
                        touchedOpponents++;
                        movesMade++;
                        if (touchedOpponents == opponentCount){
                            System.out.println("Game over!");
                            System.out.printf("Touched opponents: %d Moves made: %d%n",touchedOpponents,movesMade);
                            return;
                        }

                    } else if (matrix[blindManRow][blindManCol].equals("-")) {
                        matrix[blindManRow - 1][blindManCol] = "-";
                        matrix[blindManRow][blindManCol] = "B";
                        movesMade++;
                    }
                    break;
                case "left":

                    if (blindManCol - 1 < 0){
                        command = scanner.nextLine();
                        continue;
                    }
                    if (matrix[blindManRow ][blindManCol - 1].equals("O") ){
                        command = scanner.nextLine();
                        continue;
                    }

                    blindManCol = blindManCol - 1;

                    if (matrix[blindManRow][blindManCol].equals("P")){
                        matrix[blindManRow ][blindManCol + 1] = "-";
                        matrix[blindManRow][blindManCol] = "B";


                        touchedOpponents++;
                        movesMade++;
                        if (touchedOpponents == opponentCount){
                            System.out.println("Game over!");
                            System.out.printf("Touched opponents: %d Moves made: %d%n",touchedOpponents,movesMade);
                            return;
                        }

                    } else if (matrix[blindManRow][blindManCol].equals("-")) {
                        matrix[blindManRow ][blindManCol + 1] = "-";
                        matrix[blindManRow][blindManCol] = "B";
                        movesMade++;
                    }
                    break;
                case "right":

                    if (blindManCol + 1 > inputCols - 1){
                        command = scanner.nextLine();
                        continue;
                    }
                    if (matrix[blindManRow ][blindManCol + 1].equals("O") ){
                        command = scanner.nextLine();
                        continue;
                    }

                    blindManCol = blindManCol + 1;

                    if (matrix[blindManRow][blindManCol].equals("P")){
                        matrix[blindManRow ][blindManCol - 1] = "-";
                        matrix[blindManRow][blindManCol] = "B";
                        touchedOpponents++;
                        movesMade++;
                        if (touchedOpponents == opponentCount){
                            System.out.println("Game over!");
                            System.out.printf("Touched opponents: %d Moves made: %d%n",touchedOpponents,movesMade);
                            return;
                        }

                    } else if (matrix[blindManRow][blindManCol].equals("-")) {
                        matrix[blindManRow ][blindManCol - 1] = "-";
                        matrix[blindManRow][blindManCol] = "B";
                        movesMade++;
                    }

                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d Moves made: %d%n",touchedOpponents,movesMade);
    }

}
