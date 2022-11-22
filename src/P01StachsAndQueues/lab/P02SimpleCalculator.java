package P01StachsAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input=scanner.nextLine().split(" ");
        ArrayDeque<String>stack=new ArrayDeque<>();

        for (int i = input.length-1; i >=0; i--) {
            stack.push(input[i]);
        }
        while (stack.size()!=1){

            int operandOne= Integer.parseInt(stack.pop());
            String operator=stack.pop();
            int operandTwo= Integer.parseInt(stack.pop());

            int result=0;
            if (operator.equals("+")){
               result=operandOne+operandTwo;
            }else {
                result=operandOne-operandTwo;
            }

            stack.push(String.valueOf(result));


        }
        System.out.println(stack.pop());
    }
}
