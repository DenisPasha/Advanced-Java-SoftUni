package Exams.P06;

import java.util.Scanner;

public class P02ThroneConquering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parisHealth = Integer.parseInt(scanner.nextLine());
        int rowCount = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[rowCount][];
        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = scanner.nextLine().split("");
        }

        int parisRow = 0;
        int parisCol = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("P")){
                    parisRow = row;
                    parisCol = col;
                    matrix[parisRow][parisCol] = "-";
                }
            }
        }

        String commands = scanner.nextLine();

        while (true){
            String[] commandArr = commands.split(" ");

            String parisDirection = commandArr[0];
            int enemyRow = Integer.parseInt(commandArr[1]);
            int enemyCol = Integer.parseInt(commandArr[2]);

            matrix[enemyRow][enemyCol] = "S";
            switch (parisDirection){
                case "up":
                    parisRow = parisRow - 1;
                    if (parisRow < 0){
                        parisRow = 0;
                        parisHealth -= 1;
                    }else {
                        parisHealth = parisHealth - 1 ;
                        parisHealth = getParisHealth(parisHealth, matrix, parisRow, parisCol);
                    }
                    break;
                case "down":
                    parisRow = parisRow + 1;
                    if (parisRow > matrix.length - 1){
                        parisRow = matrix.length - 1;
                        parisHealth -= 1;
                    }else {
                        parisHealth = parisHealth - 1 ;
                        parisHealth = getParisHealth(parisHealth, matrix, parisRow, parisCol);
                    }
                    break;
                case "left":
                    parisCol = parisCol - 1;
                    if (parisCol < 0){
                        parisCol = 0;
                        parisHealth -= 1;
                    }else {
                        parisHealth = parisHealth - 1 ;
                        parisHealth = getParisHealth(parisHealth, matrix, parisRow, parisCol);
                    }
                    break;
                case "right":
                    parisCol = parisCol + 1;
                    if (parisCol > matrix.length - 1){
                        parisCol = matrix.length - 1;
                        parisHealth -= 1;
                    }else {
                        parisHealth = parisHealth - 1 ;
                        parisHealth = getParisHealth(parisHealth, matrix, parisRow, parisCol);
                    }
                    break;
            }


            commands = scanner.nextLine();
        }

    }

    private static int getParisHealth(int parisHealth, String[][] matrix, int parisRow, int parisCol) {
        if (matrix[parisRow][parisCol] .equals("S")){
            parisHealth -= 2;
            ifParisDead(parisHealth, matrix, parisRow, parisCol);
        } else if (matrix[parisRow][parisCol].equals("H")) {
            matrix[parisRow][parisCol] = "-";
            System.out.printf("Paris has successfully abducted Helen! Energy left: %d%n", parisHealth);
            printMatrix(matrix);
        }else {
            ifParisDead(parisHealth, matrix, parisRow, parisCol);
        }
        return parisHealth;
    }

    private static void ifParisDead(int parisHealth, String[][] matrix, int parisRow, int parisCol) {
        if (parisHealth < 1){
            matrix[parisRow][parisCol] = "X";
            System.out.printf("Paris died at %d;%d.%n", parisRow, parisCol);
            printMatrix(matrix);
        }else {
            matrix[parisRow][parisCol] = "-";
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }
}
