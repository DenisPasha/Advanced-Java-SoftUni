package Exams.P04;

import java.util.*;

public class P01AutumnCocktails {

    private static final int PEAR_SOUL = 150;
    private static final int THE_HARVEST = 250;
    private static final int APPLE_HINNY = 300;
    private static final int HIGH_FASHION = 400;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ingredientsInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] freshnessInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Map<String , Integer> map = new TreeMap<>();
        map.put("The Harvest",0);
        map.put("Pear Sour",0);
        map.put("Apple Hinny",0);
        map.put("High Fashion",0);

        ArrayDeque<Integer> freshnessStack = new ArrayDeque<>();
        ArrayDeque<Integer> ingredientsQueue = new ArrayDeque<>();

        for (int i = 0; i < ingredientsInput.length; i++) {
            ingredientsQueue.offer(ingredientsInput[i]);
        }
        for (int i = 0; i < freshnessInput.length; i++) {
            freshnessStack.push(freshnessInput[i]);
        }

        while (!freshnessStack.isEmpty() && !ingredientsQueue.isEmpty()){
            int freshnessLevel = freshnessStack.peek();
            int ingredientLevel = ingredientsQueue.peek();
            if (ingredientLevel == 0){
                ingredientsQueue.poll();
                continue;
            }

            int cocktail = freshnessLevel * ingredientLevel;

            switch (cocktail){
                case THE_HARVEST:
                    ingredientsQueue.poll();
                    freshnessStack.pop();
                    int theHarvest = map.get("The Harvest") + 1;
                    map.put("The Harvest",theHarvest);
                    break;
                case APPLE_HINNY:
                    ingredientsQueue.poll();
                    freshnessStack.pop();
                    int appleHinny = map.get("Apple Hinny") + 1;
                    map.put("Apple Hinny",appleHinny);
                    break;
                case PEAR_SOUL:
                    ingredientsQueue.poll();
                    freshnessStack.pop();
                    int pearSoul = map.get("Pear Sour") + 1;
                    map.put("Pear Sour",pearSoul);
                    break;
                case HIGH_FASHION:
                    ingredientsQueue.poll();
                    freshnessStack.pop();
                    int highFashion = map.get("High Fashion") + 1;
                    map.put("High Fashion",highFashion);
                    break;
                default:
                    freshnessStack.pop();
                    ingredientLevel +=5;
                    ingredientsQueue.poll();
                    if (ingredientLevel != 0){
                        ingredientsQueue.offer(ingredientLevel);
                    }


            }


        }

        boolean missionCompleted = true;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0){
                missionCompleted = false;
            }
        }
        if (missionCompleted){
            int sum = 0;
            while (!ingredientsQueue.isEmpty()){
                sum+=ingredientsQueue.poll();
            }

            System.out.println("It's party time! The cocktails are ready!");
            if(sum > 0){
                System.out.printf("Ingredients left: %d%n",sum);
            }
        }else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
            int sum = 0;
            while (!ingredientsQueue.isEmpty()){
                sum+=ingredientsQueue.poll();
            }
            if(sum > 0){
                System.out.printf("Ingredients left: %d%n",sum);
            }

        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0){
                System.out.printf(" # %s --> %d%n",entry.getKey(),entry.getValue());
            }
        }


    }
}
