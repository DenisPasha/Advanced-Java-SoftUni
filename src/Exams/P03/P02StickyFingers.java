package Exams.P03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02StickyFingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[size][size];

        List<String> commandList = Arrays.stream(scanner.nextLine().split(",")).collect(Collectors.toList());

        for (int r = 0; r < size; r++) {
            matrix[r] = scanner.nextLine().split(" ");
        }

        int dilingerRow = 0;
        int dilingercol = 0;

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (matrix[r][c].equals("D")){
                    dilingerRow = r;
                    dilingercol = c;
                }
            }
        }

        double stolenMoney = 0;
        boolean end = false;

        for (int i = 0; i < commandList.size(); i++) {
            if (end){
                break;
            }
            String currentCommand = commandList.get(i);
            switch (currentCommand){
                case "up":
                    if (dilingerRow - 1 >=0){
                        matrix[dilingerRow][dilingercol]="+";
                        String nextMoveCharacter = matrix[dilingerRow-1][dilingercol];
                        switch (nextMoveCharacter){
                            case "P":
                                System.out.printf("You got caught with %.0f$, and you are going to jail.%n",stolenMoney);
                                dilingerRow = dilingerRow -1;
                                matrix[dilingerRow][dilingercol] = "#";
                                end = true;
                                break;
                            case "$":
                                double money = dilingerRow * dilingercol;
                                stolenMoney+=money;
                                System.out.printf("You successfully stole %.0f$.%n",money);
                                dilingerRow = dilingerRow -1;
                                matrix[dilingerRow][dilingercol] = "D";
                                break;
                            case "+":
                                dilingerRow = dilingerRow-1;
                                matrix[dilingerRow][dilingercol] = "D";
                                break;
                        }
                    }else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "down":

                    if (dilingerRow + 1 < size){
                        matrix[dilingerRow][dilingercol]="+";
                        String nextMoveCharacter = matrix[dilingerRow+1][dilingercol];
                        switch (nextMoveCharacter){
                            case "P":
                                System.out.printf("You got caught with %.0f$, and you are going to jail.%n",stolenMoney);
                                dilingerRow = dilingerRow +1;
                                matrix[dilingerRow][dilingercol] = "#";
                                end = true;
                                break;
                            case "$":
                                dilingerRow = dilingerRow +1;
                                double money = dilingerRow * dilingercol;
                                stolenMoney+=money;
                                System.out.printf("You successfully stole %.0f$.%n",money);

                                matrix[dilingerRow][dilingercol] = "D";
                                break;
                            case "+":
                                dilingerRow = dilingerRow +1;
                                matrix[dilingerRow][dilingercol] = "D";
                                break;
                        }
                    }else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }

                    break;
                case "left":
                    if (dilingercol - 1 >=0){
                        matrix[dilingerRow][dilingercol]="+";
                        String nextMoveCharacter = matrix[dilingerRow][dilingercol -1];
                        switch (nextMoveCharacter){
                            case "P":
                                System.out.printf("You got caught with %.0f$, and you are going to jail.%n",stolenMoney);
                                dilingercol = dilingercol -1;
                                matrix[dilingerRow ][dilingercol] = "#";
                                end = true;
                                break;
                            case "$":
                                double money = dilingerRow  * (dilingercol -1) ;
                                stolenMoney+=money;
                                System.out.printf("You successfully stole %.0f$.%n",money);
                                dilingercol = dilingercol -1;
                                matrix[dilingerRow][dilingercol] = "D";
                                break;
                            case "+":
                                dilingercol = dilingercol -1;
                                matrix[dilingerRow][dilingercol] = "D";
                                break;
                        }
                    }else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "right":

                    if (dilingercol + 1 < size){
                        matrix[dilingerRow][dilingercol]="+";
                        String nextMoveCharacter = matrix[dilingerRow][dilingercol+1];
                        switch (nextMoveCharacter){
                            case "P":
                                System.out.printf("You got caught with %.0f$, and you are going to jail.%n",stolenMoney);
                                dilingercol = dilingercol + 1;
                                matrix[dilingerRow][dilingercol] = "#";
                                end = true;
                                break;
                            case "$":
                                dilingercol = dilingercol + 1;
                                double money = dilingerRow * dilingercol  ;
                                stolenMoney+=money;
                                System.out.printf("You successfully stole %.0f$.%n",money);
                                matrix[dilingerRow][dilingercol ] = "D";
                                break;
                            case "+":
                                dilingercol = dilingercol +1;
                                matrix[dilingerRow][dilingercol] = "D";
                                break;
                        }
                    }else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
            }
        }
        if (!end){
            System.out.printf("Your last theft has finished successfully with %.0f$ in your pocket.%n",stolenMoney);
        }


        for (int ro = 0; ro < size; ro++) {
            for (int co = 0; co < size-1; co++) {
                System.out.print(matrix[ro][co]+" ");
            }
            System.out.print(matrix[ro][size-1]);
            System.out.println();
        }


    }


}
