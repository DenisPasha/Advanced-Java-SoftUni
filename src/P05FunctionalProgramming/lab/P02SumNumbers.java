package P05FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]inputArr = scanner.nextLine().split(", ");

        System.out.printf("Count = %d%n",inputArr.length);

       int sum = Arrays.stream(inputArr)
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.printf("Sum = %d",sum);
    }
}
