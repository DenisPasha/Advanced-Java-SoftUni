package Exams.P02;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P01KAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> licensePlateQ = new ArrayDeque<>();
        ArrayDeque<Integer> carsStack = new ArrayDeque<>();

        int[] inputQ = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] inputStack = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < inputQ.length; i++) {
            licensePlateQ.offer(inputQ[i]);
        }
        for (int i = 0; i < inputStack.length; i++) {
            carsStack.push(inputStack[i]);
        }
       // System.out.println(carsStack.pop()); -> 50
      //  System.out.println(licensePlateQ.poll()); -> 20

        int registeredCars = 0;
        int days = 0;
        while (carsStack.size() > 0 && licensePlateQ.size() > 0){
            int currentCars = carsStack.pop();
            int currentCarPlates = licensePlateQ.poll();

            if (currentCarPlates / 2 > currentCars){
                currentCarPlates = currentCarPlates - (currentCars * 2);
                registeredCars = registeredCars + currentCars;
                days++;
                licensePlateQ.offer(currentCarPlates);
            }else if (currentCars > currentCarPlates / 2){
                registeredCars = registeredCars + (currentCarPlates / 2);
                currentCars = currentCars - (currentCarPlates / 2);

                days++;
                carsStack.addLast(currentCars);
            }else {
                registeredCars+=currentCars;
                days++;
            }
        }


        System.out.printf("%d cars were registered for %d days!%n",registeredCars,days);
        if (licensePlateQ.size() ==0 && carsStack.size() ==0){
            System.out.println("Good job! There is no queue in front of the KAT!");
        } else if (licensePlateQ.size() > 0) {
            int plates = 0;
            while (licensePlateQ.size() > 0){
                plates = plates + licensePlateQ.poll();
            }
            System.out.printf("%d license plates remain!%n",plates);
        } else if (carsStack.size() > 0) {
            int carsCount = 0;
            while (carsStack.size() > 0 ){
                carsCount = carsCount + carsStack.pop();
            }
            System.out.printf("%d cars remain without license plates!%n",carsCount);
        }
        System.out.println();




    }
}
