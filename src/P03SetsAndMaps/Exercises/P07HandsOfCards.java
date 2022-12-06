package P03SetsAndMaps.Exercises;

import java.util.*;

public class P07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Set<String>> map = new LinkedHashMap<>();

        while (!input.equals("JOKER")){

            String[] inputArr = input.split(": ");
            String name = inputArr[0];
            String[] cardArr = inputArr[1].split(", ");

            map.putIfAbsent(name,new LinkedHashSet<>());
            map.get(name).addAll(Arrays.asList(cardArr));

            input = scanner.nextLine();
        }


        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {

            List<String> currentPlayerCards = new ArrayList<>(entry.getValue());
            int totalPoints = 0;

            for (int i = 0; i < currentPlayerCards.size(); i++) {
                String currentCard = currentPlayerCards.get(i);
                String power = "";
                String type = "";
                if (currentCard.startsWith("10")){
                    power = "10";
                    type = String.valueOf(currentCard.charAt(currentCard.length()-1));
                }else {
                    power = String.valueOf(currentCard.charAt(0));
                    type = String.valueOf(currentCard.charAt(1));
                }



                if (power .equals("J")){
                    power = "11";
                } else if (power.equals("Q")) {
                    power = "12";
                } else if (power.equals("K")) {
                    power = "13";
                } else if (power.equals("A")) {
                    power = "14";
                }

                if (type.equals("C")){
                    type = "1";
                } else if (type.equals("D")) {
                    type = "2";
                }else if (type.equals("H")) {
                    type = "3";
                }else if (type.equals("S")) {
                    type = "4";
                }

                int currentPoints = Integer.parseInt(power) * Integer.parseInt(type);
                totalPoints+=currentPoints;

            }

            System.out.printf("%s: %d%n",entry.getKey(),totalPoints);

        }


    }
}
