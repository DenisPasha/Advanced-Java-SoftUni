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
        while (carsStack.size() >0 && licensePlateQ.size() > 0){
            int cars = carsStack.pop();
            int carPlates = licensePlateQ.poll();



            if (carPlates / 2 > cars){
                carPlates = carPlates - (cars * 2);
                registeredCars = registeredCars + cars;
                days++;
                licensePlateQ.offer(carPlates);
            }else if (cars > carPlates / 2){
                cars = cars - (carPlates / 2);
                days++;
                carsStack.offer(cars);
            }else {
                registeredCars+=cars;
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
