package P02MultiDimensionalArrays.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotateCommand=scanner.nextLine();

        String command=scanner.nextLine();
        StringBuilder sb=new StringBuilder();

        while (!command.equals("END")){
            sb.append(command+" ");
            command=scanner.nextLine();
        }

        String[]inputArr=sb.toString().split(" ");
        //reverse array order
        String[] inputReversed=new String[inputArr.length];
        for (int i = inputArr.length-1; i >=0 ; i--) {
            inputReversed[inputReversed.length-i-1]=inputArr[i];
        }
        //matrix dimensions
        int rows=inputArr.length;
        int cols=getColLength(inputArr);

        String regex="\\d+";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(rotateCommand);
        int degrees=0;
        while (matcher.find()){
            degrees= Integer.parseInt(matcher.group());
        }
        System.out.println();
       while (degrees > 270){
           degrees=degrees-360;
       }

        if (degrees==90){
            // rotate 90
            rotateTo90(inputReversed,rows,cols);
        } else if (degrees==180) {
            //rotate 180
            rotateTo180(inputReversed,rows,cols);
        }else if (degrees==270) {
            //rotate 270
            rotateTo270(inputArr,rows,cols);
        }else if (degrees==0) {
            //rotate 0
            rotateTo0(inputArr,rows,cols);
        }

    }

    private static void rotateTo270(String[] inputArr, int rows, int cols) {
        String[][]matrixTo270=new String[cols][rows];

        for (int r = 0; r < rows; r++) {
            for (int i = 0; i < inputArr.length; i++) {
                String current=inputArr[i];
                int counter=0;
                int rowsCounter=cols-1;
                for (int c = 0; c < current.length(); c++) {
                    matrixTo270[rowsCounter][r]= String.valueOf(current.charAt(counter));
                    rowsCounter--;
                    counter++;
                }
                for (int j = rowsCounter; j >=0 ; j--) {
                    System.out.println();
                    matrixTo270[j][r]=" ";
                }
                r++;
            }

        }
        printMatrix(matrixTo270);
    }

    private static void rotateTo180(String[] inputReversed, int rows, int cols) {

        for (int i = 0; i < inputReversed.length; i++) {
            String current=inputReversed[i];
            StringBuilder sb1=new StringBuilder();
            for (int j = current.length()-1; j >=0 ; j--) {
                sb1.append(current.charAt(j));
            }
            inputReversed[i]=sb1.toString();
        }

        String[][]matrixTo180=new String[rows][cols];
        for (int r = 0; r < matrixTo180.length; r++) {
            matrixTo180[r]=inputReversed[r].split(" ");
        }

        printMatrix(matrixTo180);
    }

    private static void printMatrix(String[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }


    private static void rotateTo90(String[] inputReversed, int rows, int cols) {
        int coloni=rows;
        int redove=cols;
        String[][]matrixTo90=new String[redove][coloni];


        System.out.println();

        for (int c = 0; c < coloni; c++) {
            for (int i = 0; i < inputReversed.length; i++) {
                String currentWord = inputReversed[i];
                for (int r = 0; r < currentWord.length(); r++) {
                    matrixTo90[r][c] = String.valueOf(currentWord.charAt(r));
                }
                for (int j = currentWord.length(); j < redove ; j++) {
                    matrixTo90[j][c]=" ";
                }
                c++;
            }
        }

        printMatrix(matrixTo90);
    }

    private static void rotateTo0(String[] inputArr, int rows, int cols) {
        String[][]matrixNormal=new String[rows][cols];
        for (int r = 0; r < matrixNormal.length; r++) {
            matrixNormal[r]=inputArr[r].split(" ");
        }

        printMatrix(matrixNormal);
    }

    private static int getColLength(String[] inputArr) {

        int sum=0;
        for (int i = 0; i < inputArr.length; i++) {
            String currentString=inputArr[i];
            if (currentString.length() > sum){
                sum = currentString.length();
            }
        }
        return sum;
    }
}
