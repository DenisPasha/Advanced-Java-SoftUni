package Exams.P01;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> milligramsStack = new ArrayDeque<>();
        ArrayDeque <Integer> energyDrinkQueue = new ArrayDeque<>();

        int[] milligramsArr = Arrays.stream(scanner.nextLine().split("[, ]+")).mapToInt(Integer::parseInt).toArray();
        int[] drinksArr = Arrays.stream(scanner.nextLine().split("[, ]+")).mapToInt(Integer::parseInt).toArray();

        for (int k : milligramsArr) {
            milligramsStack.push(k);
        }

        for (int j : drinksArr) {
            energyDrinkQueue.offer(j);
        }

        int caffeine = 0;
        while (milligramsStack.size() > 0 && energyDrinkQueue.size() >0){

            int result = milligramsStack.peek() * energyDrinkQueue.peek();

            if (result + caffeine <= 300){
                caffeine = caffeine + result;
                milligramsStack.pop();
                energyDrinkQueue.poll();
            }else {
                milligramsStack.pop();
                int temp = energyDrinkQueue.poll();
                energyDrinkQueue.offer(temp);
                if (caffeine - 30 >= 0){
                    caffeine = caffeine-30;
                }else {
                    caffeine = 0;
                }
            }
        }

        if (energyDrinkQueue.size() ==1){
            System.out.println(energyDrinkQueue.poll());
        }
       else if (energyDrinkQueue.size() > 1){
            System.out.print("Drinks left: ");
            for (int i = 0; i < energyDrinkQueue.size(); i++) {
                System.out.print(energyDrinkQueue.poll()+", ");
            } for (int i = 1; i <= energyDrinkQueue.size(); i++) {
                System.out.print(energyDrinkQueue.poll());
            }
            System.out.println();
        }else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.",caffeine);
    }
}
