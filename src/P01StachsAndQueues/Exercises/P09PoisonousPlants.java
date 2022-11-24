package P01StachsAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P09PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPlants=Integer.parseInt(scanner.nextLine());
        int[]plantsPoison= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer>stack=new ArrayDeque<>();


    }
}
