package Exams.P01;

import java.util.Scanner;

public class P02RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int dimensions = Integer.parseInt(scanner.nextLine());
        String carNumber = scanner.nextLine();

        String [][] matrix = new String[dimensions][dimensions];

        for (int rows = 0; rows < dimensions; rows++) {
            matrix[rows]= scanner.nextLine().split(" ");
        }

        int carRow = 0;
        int carCol = 0;
        matrix[0][0]="C";

        String command = scanner.nextLine();
        int kilometers = 0;
        boolean finishIsReached = false;
        while (!command.equals("End")){

            if (command.equals("down")){

                if (carRow + 1 <= matrix.length){

                    matrix[carRow][carCol] =".";
                    carRow=carRow+1;

                    if (matrix[carRow][carCol].equals(".")){
                        // free space
                        matrix[carRow][carCol]="C";
                        kilometers = kilometers+10;
                    } else if (matrix[carRow][carCol].equals("F")) {
                        //Finish
                        kilometers+=10;
                        System.out.printf("Racing car %s finished the stage!%n",carNumber);
                        finishIsReached=true;
                        break;
                    } else if (matrix[carRow][carCol].equals("T")) {
                        matrix[carRow][carCol]=".";
                        //Tunel
                        kilometers+=30;
                        boolean enough = false;

                        for (int row = carRow; row < matrix.length; row++) {
                            carCol=0;
                            for (int col = carCol+1; col < matrix.length; col++) {
                                if (matrix[row][col].equals("T")){
                                    carRow = row;
                                    carCol = col;
                                    matrix[carRow][carCol] = "C";
                                    enough = true;

                                }
                            }
                        }
                    }

                }


            } else if (command.equals("up")) {

                if (carRow - 1 >= 0){

                    matrix[carRow][carCol] =".";
                    carRow=carRow-1;


                    if (matrix[carRow][carCol].equals(".")){
                        // free space
                        matrix[carRow][carCol]="C";
                        kilometers+=10;
                    } else if (matrix[carRow][carCol].equals("F")) {
                        //Finish
                        kilometers+=10;
                        System.out.printf("Racing car %s finished the stage!%n",carNumber);
                        finishIsReached=true;
                        break;
                    } else if (matrix[carRow][carCol].equals("T")) {
                        matrix[carRow][carCol]=".";
                        //Tunel
                        kilometers+=30;
                        boolean enough = false;

                        for (int row = carRow; row < matrix.length; row++) {
                            carCol=0;
                            for (int col = carCol+1; col < matrix.length; col++) {
                                if (matrix[row][col].equals("T")){
                                    carRow = row;
                                    carCol = col;
                                    matrix[carRow][carCol] = "C";
                                    enough = true;

                                }
                            }
                        }
                    }
                }

            } else if (command.equals("right")) {

                if (carCol + 1 <= matrix.length){

                    matrix[carRow][carCol] =".";
                    carCol=carCol+1;

                    if (matrix[carRow][carCol].equals(".")){
                        // free space
                        matrix[carRow][carCol]="C";
                        kilometers+=10;
                    } else if (matrix[carRow][carCol].equals("F")) {
                        //Finish
                        kilometers+=10;
                        matrix[carRow][carCol]="C";
                        System.out.printf("Racing car %s finished the stage!%n",carNumber);
                        finishIsReached= true;
                        break;
                    } else if (matrix[carRow][carCol].equals("T")) {
                        matrix[carRow][carCol]=".";
                        //Tunel
                        kilometers+=30;
                        boolean enough = false;

                        int index = carCol+1;
                        for (int row = carRow; row < matrix.length; row++) {
                            index = 0;
                            if (enough){
                                break;
                            }
                            for (int col = index; col < matrix.length; col++) {
                                if (matrix[row][col].equals("T")){
                                    carRow = row;
                                    carCol = col;
                                    matrix[carRow][carCol] = "C";
                                    enough = true;
                                    break;

                                }
                            }
                        }
                    }

                }

            }else if (command.equals("left")) {

                if (carCol - 1 >= 0 ){

                    matrix[carRow][carCol] =".";
                    carCol=carCol-1;


                    if (matrix[carRow][carCol].equals(".")){
                        // free space
                        matrix[carRow][carCol]="C";
                        kilometers+=10;
                    } else if (matrix[carRow][carCol].equals("F")) {
                        //Finish
                        kilometers+=10;
                        System.out.printf("Racing car %s finished the stage!%n",carNumber);
                        finishIsReached=true;
                        break;
                    } else if (matrix[carRow][carCol].equals("T")) {
                        matrix[carRow][carCol]=".";
                        //Tunel
                        kilometers+=30;
                        boolean enough = false;

                        for (int row = carRow; row < matrix.length; row++) {
                            carCol=0;
                            for (int col = carCol+1; col < matrix.length; col++) {
                                if (matrix[row][col].equals("T")){
                                    carRow = row;
                                    carCol = col;
                                    matrix[carRow][carCol] = "C";
                                    enough = true;

                                }
                            }
                        }
                    }
                }
            }


            command=scanner.nextLine();
        }

        if (!finishIsReached){
            System.out.printf("Racing car %s DNF.%n",carNumber);
        }
        System.out.printf("Distance covered %d km.%n",kilometers);
        printMatrix(matrix);

    }

    private static void printMatrix(String[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix.length; cols++) {
                System.out.print(matrix[rows][cols]);
            }
            System.out.println();
        }
    }


}
