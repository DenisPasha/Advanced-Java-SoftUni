package Exams.P011;

import java.util.*;

public class EnergyDrink {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] caffeineMgInput = Arrays.stream(scanner.nextLine().split("[, ]+")).mapToInt(Integer::parseInt).toArray();
        int [] energyDrinksInput = Arrays.stream(scanner.nextLine().split("[, ]+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> caffeineStack = new ArrayDeque<>();
        ArrayDeque<Integer> energyDrinksQueue = new ArrayDeque<>();

        for (int j : caffeineMgInput) {
            caffeineStack.push(j);
        }

        for (int j : energyDrinksInput) {
            energyDrinksQueue.offer(j);
        }

        int stamatCoffeine = 0;

        while (!caffeineStack.isEmpty() && !energyDrinksQueue.isEmpty()){
            int currentCaffeine = caffeineStack.pop();
            int currentEnergy = energyDrinksQueue.poll();

            int momentumCaffeine = currentCaffeine * currentEnergy;
            if (momentumCaffeine + stamatCoffeine > 300 ){
                energyDrinksQueue.offer(currentEnergy);
                if (stamatCoffeine - 30 >= 0){
                    stamatCoffeine -=30;
                }

            }else {
                stamatCoffeine += momentumCaffeine;
            }

        }


        if (!energyDrinksQueue.isEmpty()){
            System.out.print("Drinks left: ");
            for (int i = 0; i < energyDrinksQueue.size() - 1; i++) {
                System.out.printf("%d, ",energyDrinksQueue.poll());
            }
            System.out.printf("%d%n", energyDrinksQueue.poll());
        }else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");

        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.",stamatCoffeine);
    }
}
