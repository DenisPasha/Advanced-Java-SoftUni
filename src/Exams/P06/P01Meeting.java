package Exams.P06;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] maleInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] femaleInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> maleStack = new ArrayDeque<>();
        ArrayDeque<Integer> femaleQueue = new ArrayDeque<>();

        for (int i = 0; i < maleInput.length; i++) {
            maleStack.push(maleInput[i]);
        }

        for (int i = 0; i < femaleInput.length; i++) {
            femaleQueue.offer(femaleInput[i]);
        }
        int matches = 0;

        while (!maleStack.isEmpty() && !femaleQueue.isEmpty()){
            Integer currentMale = maleStack.peek();
            Integer currentFemale = femaleQueue.peek();

            if (currentMale < 1){
                maleStack.pop();
                continue;
            }
            if (currentFemale < 1){
                femaleQueue.poll();
                continue;
            }

            if (currentMale % 25 == 0 ){
                maleStack.pop();
                maleStack.pop();
                continue;
            }

            if (currentFemale % 25 ==0){
                femaleQueue.poll();
                femaleQueue.poll();
                continue;
            }


            if (currentMale == currentFemale){
                maleStack.pop();
                femaleQueue.poll();
                matches++;

            }else {
                femaleQueue.poll();
                maleStack.pop();
                currentMale -= 2;
                maleStack.push(currentMale);

            }
        }
        System.out.printf("Matches: %d%n",matches);
        if (maleStack.isEmpty()){
            System.out.println("Males left: none");
        }else {
            System.out.print("Males left: ");
            while (maleStack.size() > 1){
                System.out.printf("%d, ",maleStack.pop());
            }
            System.out.printf("%d", maleStack.pop());
            System.out.println();
        }

        if (femaleQueue.isEmpty()){
            System.out.println("Females left: none");
        }else {
            System.out.print("Females left: ");
            while (femaleQueue.size() >1 ){
                System.out.printf("%d, ",femaleQueue.poll());
            }
            System.out.printf("%d", femaleQueue.poll());

        }

    }
}
