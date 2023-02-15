package Exams.P011;

import java.util.Scanner;

public class RacingBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());

        String raceCarNumber = scanner.nextLine();

        String [][] matrix = new String[size][size];
        int raceCarPositionRow = 0;
        int raceCarPositionCol = 0;


        for (int rows = 0; rows < matrix.length; rows++) {
            matrix[rows] = scanner.nextLine().split(" ");
        }

        matrix[raceCarPositionRow][raceCarPositionCol] = "C";
        String command = scanner.nextLine();
        int kilometersPassed = 0;


        while (!command.equals("End")){

            if (command.equals("up")){
                raceCarPositionRow --;
                if (matrix[raceCarPositionRow][raceCarPositionCol] .equals(".")){
                    kilometersPassed+=10;
                    matrix[raceCarPositionRow+1][raceCarPositionCol] = ".";
                    matrix[raceCarPositionRow][raceCarPositionCol] = "C";

                } else if (matrix[raceCarPositionRow][raceCarPositionCol] .equals("T")) {
                    matrix[raceCarPositionRow][raceCarPositionCol] = "C";
                    matrix[raceCarPositionRow+1][raceCarPositionCol] = ".";

                    for (int r = raceCarPositionRow; r < matrix.length; r++) {
                        int column = raceCarPositionCol+1;
                        if (column == 4){
                            column = 0;
                        }
                        for (int c = column; c < matrix.length; c++) {
                            if (matrix[r][c] .equals("T")){
                                matrix[raceCarPositionRow][raceCarPositionCol] = ".";
                                raceCarPositionRow = r;
                                raceCarPositionCol = c;
                                matrix[raceCarPositionRow][raceCarPositionCol] = "C";
                                kilometersPassed += 30;
                            }
                        }
                    }
                } else if (matrix[raceCarPositionRow][raceCarPositionCol] .equals("F")) {
                    kilometersPassed+=10;
                    matrix[raceCarPositionRow][raceCarPositionCol] = "C";
                    matrix[raceCarPositionRow][raceCarPositionCol+1] = ".";
                    System.out.printf("Racing car %s finished the stage!.%n",raceCarNumber);
                    System.out.printf("Distance covered %d km.%n",kilometersPassed);
                    printMatrix(matrix);

                    break;
                }
            } else if (command.equals("down")) {
                raceCarPositionRow ++;
                if (matrix[raceCarPositionRow][raceCarPositionCol] .equals(".")){
                    kilometersPassed+=10;
                    matrix[raceCarPositionRow-1][raceCarPositionCol] = ".";
                    matrix[raceCarPositionRow][raceCarPositionCol] = "C";

                } else if (matrix[raceCarPositionRow][raceCarPositionCol] .equals("T")) {
                    matrix[raceCarPositionRow][raceCarPositionCol] = "C";
                    matrix[raceCarPositionRow-1][raceCarPositionCol] = ".";

                    for (int r = raceCarPositionRow; r < matrix.length; r++) {
                        int column = raceCarPositionCol+1;
                        if (column == 4){
                            column = 0;
                        }
                        for (int c = column; c < matrix.length; c++) {
                            if (matrix[r][c] .equals("T") ){
                                matrix[raceCarPositionRow][raceCarPositionCol] = ".";
                                raceCarPositionRow = r;
                                raceCarPositionCol = c;
                                matrix[raceCarPositionRow][raceCarPositionCol] = "C";
                                kilometersPassed += 30;
                            }
                        }
                    }
                } else if (matrix[raceCarPositionRow][raceCarPositionCol] .equals("F")) {
                    kilometersPassed+=10;
                    matrix[raceCarPositionRow][raceCarPositionCol] = "C";
                    matrix[raceCarPositionRow-1][raceCarPositionCol] = ".";
                    System.out.printf("Racing car %s finished the stage!.%n",raceCarNumber);
                    System.out.printf("Distance covered %d km.%n",kilometersPassed);
                    printMatrix(matrix);

                    break;
                }
            } else if (command.equals("left")) {
                raceCarPositionCol --;
                if (matrix[raceCarPositionRow][raceCarPositionCol] .equals(".")){
                    kilometersPassed+=10;
                    matrix[raceCarPositionRow][raceCarPositionCol++] = ".";
                    matrix[raceCarPositionRow][raceCarPositionCol] = "C";

                } else if (matrix[raceCarPositionRow][raceCarPositionCol] .equals("T")) {
                    matrix[raceCarPositionRow][raceCarPositionCol] = "C";
                    matrix[raceCarPositionRow][raceCarPositionCol+1] = ".";

                    for (int r = raceCarPositionRow; r < matrix.length; r++) {
                        int column = raceCarPositionCol+1;
                        if (column == 4){
                            column = 0;
                        }
                        for (int c = column; c < matrix.length; c++) {
                            if (matrix[r][c] .equals("T")){
                                matrix[raceCarPositionRow][raceCarPositionCol] = ".";
                                raceCarPositionRow = r;
                                raceCarPositionCol = c;
                                matrix[raceCarPositionRow][raceCarPositionCol] = "C";
                                kilometersPassed += 30;
                            }
                        }
                    }
                } else if (matrix[raceCarPositionRow][raceCarPositionCol] .equals("F")) {
                    matrix[raceCarPositionRow][raceCarPositionCol] = "C";
                    matrix[raceCarPositionRow][raceCarPositionCol+1] = ".";
                    kilometersPassed+=10;
                    System.out.printf("Racing car %s finished the stage!.%n",raceCarNumber);
                    System.out.printf("Distance covered %d km.%n",kilometersPassed);
                    printMatrix(matrix);

                    break;
                }
            }else if (command.equals("right")){
                raceCarPositionCol ++;
                if (matrix[raceCarPositionRow][raceCarPositionCol] .equals(".")){
                    kilometersPassed+=10;
                    matrix[raceCarPositionRow][raceCarPositionCol-1] = ".";
                    matrix[raceCarPositionRow][raceCarPositionCol] = "C";

                } else if (matrix[raceCarPositionRow][raceCarPositionCol] .equals("T")) {
                    matrix[raceCarPositionRow][raceCarPositionCol] = "C";
                    matrix[raceCarPositionRow][raceCarPositionCol-1] = ".";

                    for (int r = raceCarPositionRow; r < matrix.length; r++) {
                      int column = raceCarPositionCol+1;
                      if (column == 4){
                          column = 0;
                      }
                        for (int c = column; c < matrix.length; c++) {
                            if (matrix[r][c] .equals("T")){
                                matrix[raceCarPositionRow][raceCarPositionCol] = ".";
                                raceCarPositionRow = r;
                                raceCarPositionCol = c;
                                matrix[raceCarPositionRow][raceCarPositionCol] = "C";
                                kilometersPassed += 30;
                            }
                        }
                    }
                } else if (matrix[raceCarPositionRow][raceCarPositionCol] .equals("F")) {
                    kilometersPassed+=10;
                    matrix[raceCarPositionRow][raceCarPositionCol-1] = ".";
                    matrix[raceCarPositionRow][raceCarPositionCol] = "C";
                    System.out.printf("Racing car %s finished the stage!%n",raceCarNumber);
                    System.out.printf("Distance covered %d km.%n",kilometersPassed);
                    printMatrix(matrix);
                    return;
                }
            }

            command = scanner.nextLine();
        }
        System.out.printf("Racing car %s DNF.%n",raceCarNumber);
        System.out.printf("Distance covered %d km.%n",kilometersPassed);
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
}
