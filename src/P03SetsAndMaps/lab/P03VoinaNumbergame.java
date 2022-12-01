package P03SetsAndMaps.lab;

import java.util.*;

public class P03VoinaNumbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] deckOne= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer>firstPlayerSet=new LinkedHashSet<>();
        for (int j : deckOne) {
            firstPlayerSet.add(j);
        }

        int [] deckTwo= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer>secondPlayerSet=new LinkedHashSet<>();
        for (int j : deckTwo) {
            secondPlayerSet.add(j);
        }

        for (int i = 1; i <= 50 ; i++) {
            int playerOne=getInt(firstPlayerSet);
            int playerTwo=getInt(secondPlayerSet);

            firstPlayerSet.remove(playerOne);
            secondPlayerSet.remove(playerTwo);

            if (playerOne > playerTwo){


                firstPlayerSet.add(playerOne);
                firstPlayerSet.add(playerTwo);
            }else if (playerTwo > playerOne){

                secondPlayerSet.add(playerOne);
                secondPlayerSet.add(playerTwo);
            }else {
                firstPlayerSet.add(playerOne);
                firstPlayerSet.add(playerTwo);
            }

            if (firstPlayerSet.isEmpty()){
                System.out.println("Second player win!");
                return;
            } else if (secondPlayerSet.isEmpty()) {
                System.out.println("First player win!");
                return;
            }


        }
        if (firstPlayerSet.size() > secondPlayerSet.size()){
            System.out.println("First player win!");
        } else if (secondPlayerSet.size() > firstPlayerSet.size()) {
            System.out.println("Second player win!");
        }else {
            System.out.println("Draw!");
        }


    }

    public static <currentSet> int getInt(Set<Integer> currentSet){
     return  currentSet.iterator().next();
    }
}
