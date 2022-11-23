package P01StachsAndQueues.Exercises;

import com.sun.management.GarbageCollectorMXBean;

import java.util.*;
import java.util.stream.Collectors;

public class P02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]numArr1= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int elementsToPush=numArr1[0];
        int elementsToPop=numArr1[1];
        int elementsToPeak=numArr1[2];

        int[]numArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        ArrayDeque<Integer>stack=new ArrayDeque<>();

        for (int i = 0; i < elementsToPush; i++) {
            stack.push(numArr[i]);
        }

        for (int i = 0; i <elementsToPop ; i++) {
            stack.pop();
        }

       if (stack.contains(elementsToPeak)){
           System.out.println("true");
       }else {
           if (!stack.isEmpty()){
               int min= stack.stream()
                       .mapToInt(v -> v)
                       .min().getAsInt();
               System.out.println(min);
           }else {
               System.out.println("0");
           }

       }

    }
}
