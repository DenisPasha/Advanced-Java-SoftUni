package P01StachsAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer>stack=new ArrayDeque<>();

        for (int i = 1; i <=n ; i++) {

            int[]inputArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            if (inputArr[0]==1){
                //push
                stack.push(inputArr[1]);
            } else if (inputArr[0]==2) {
                stack.pop();
            } else if (inputArr[0]==3) {
                System.out.println(stack.stream().mapToInt(value -> value).max().getAsInt());
            }
        }
    }
}
