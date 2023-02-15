package Exams.P04;

import java.util.Scanner;

public class P2MouseandCheese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[size][size];

        for (int rows = 0; rows < matrix.length; rows++) {
            matrix[rows] = scanner.nextLine().split("");
        }

        int [] coordinates = findMouse(matrix);
        int mouseRow = coordinates[0];
        int mouseCol = coordinates[1];


        int eatenCheese = 0;

        String command = scanner.nextLine();
        while (!command.equals("end")){

            switch (command){
                case "up":
                    matrix[mouseRow][mouseCol] = "-";
                    mouseRow = mouseRow - 1;
                    if (mouseRow < 0 ){
                        System.out.println("Where is the mouse?");
                        printer(eatenCheese , matrix);
                        return;
                    }

                    if (matrix[mouseRow][mouseCol] .equals("c")){
                        eatenCheese++;
                        matrix[mouseRow][mouseCol] = "M";

                    } else if (matrix[mouseRow][mouseCol].equals("B")) {
                        matrix[mouseRow][mouseCol] = "M";
                        continue;
                    }else {
                        matrix[mouseRow][mouseCol] = "M";
                    }
                    break;
                case "down":

                    matrix[mouseRow][mouseCol] = "-";
                    mouseRow = mouseRow + 1;
                    if ( mouseRow > matrix.length-1){
                        System.out.println("Where is the mouse?");
                        printer(eatenCheese , matrix);
                        return;
                    }

                    if (matrix[mouseRow][mouseCol] .equals("c")){
                        eatenCheese++;
                        matrix[mouseRow][mouseCol] = "M";

                    } else if (matrix[mouseRow][mouseCol].equals("B")) {
                        matrix[mouseRow][mouseCol] = "M";
                        continue;
                    }else {
                        matrix[mouseRow][mouseCol] = "M";
                    }
                    break;
                case "left":

                    matrix[mouseRow][mouseCol] = "-";
                    mouseCol = mouseCol - 1;
                    if (mouseCol < 0 ){
                        System.out.println("Where is the mouse?");
                        printer(eatenCheese , matrix);
                        return;
                    }

                    if (matrix[mouseRow][mouseCol] .equals("c")){
                        eatenCheese++;
                        matrix[mouseRow][mouseCol] = "M";

                    } else if (matrix[mouseRow][mouseCol].equals("B")) {
                        matrix[mouseRow][mouseCol] = "M";
                        continue;
                    }else {
                        matrix[mouseRow][mouseCol] = "M";
                    }
                    break;
                case "right":

                    matrix[mouseRow][mouseCol] = "-";
                    mouseCol = mouseCol + 1;
                    if ( mouseRow > matrix.length-1){
                        System.out.println("Where is the mouse?");
                        printer(eatenCheese , matrix);
                        return;
                    }

                    if (matrix[mouseRow][mouseCol] .equals("c")){
                        eatenCheese++;
                        matrix[mouseRow][mouseCol] = "M";

                    } else if (matrix[mouseRow][mouseCol].equals("B")) {
                        matrix[mouseRow][mouseCol] = "M";
                        continue;
                    }else {
                        matrix[mouseRow][mouseCol] = "M";
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        printer(eatenCheese , matrix);



    }

    private static void printer(int eatenCheese , String[][] matrix) {
        if (eatenCheese < 5){
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n",5- eatenCheese);
        }else {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", eatenCheese);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }

    private static int[]  findMouse(String[][] matrix){
        int[] coordinates = new int [2];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                if (matrix[r][c] .equals("M") ){
                    coordinates[0] = r;
                    coordinates[1] = c;
                }
            }
        }
        return coordinates;
    }

}
