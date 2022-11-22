package P01StachsAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        ArrayDeque<Integer>stack=new ArrayDeque<>();

        int startIndex=0;
        int endIndex=0;

        for (int i = 0; i <input.length() ; i++) {
            char currentChar=input.charAt(i);

            if (currentChar=='('){
                stack.push(i);
            } else if (currentChar==')') {
                endIndex=i;
                startIndex=stack.pop();
                System.out.println(input.substring(startIndex,endIndex+1));
            }


        }
    }
}
