package P01StachsAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01ReverseNumberswithaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]numArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer>stack=new ArrayDeque<>();

        Arrays.stream(numArr).forEach(stack::push);

        stack.forEach(e -> System.out.printf("%d ",stack.pop()));
    }
}
