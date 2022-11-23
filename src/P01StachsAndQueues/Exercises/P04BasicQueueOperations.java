package P01StachsAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[]numArr1= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int elementsToPush=numArr1[0];
        int elementsToPop=numArr1[1];
        int elementsToPeak=numArr1[2];

        int[]numArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        ArrayDeque<Integer> queue=new ArrayDeque<>();

        for (int i = 0; i < elementsToPush; i++) {
            queue.offer(numArr[i]);
        }

        for (int i = 0; i <elementsToPop ; i++) {
            queue.poll();
        }

        if (queue.contains(elementsToPeak)){
            System.out.println("true");
        }else {
            if (!queue.isEmpty()){
                int min= queue.stream()
                        .mapToInt(v -> v)
                        .min().getAsInt();
                System.out.println(min);
            }else {
                System.out.println("0");
            }

        }
    }
}
