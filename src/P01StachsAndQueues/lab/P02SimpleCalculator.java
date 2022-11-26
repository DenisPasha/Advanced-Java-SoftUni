package P01StachsAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        String[] inputArr=input.split(" ");
        ArrayDeque<String>stack=new ArrayDeque<>();


        for (int i = inputArr.length-1; i >=0 ; i--) {
            String current= inputArr[i];
            if (!current.equals(" ")){
                stack.push(current);
            }
        }

        while (stack.size()>1){
            int fNum= Integer.parseInt(stack.pop());
            String operator= stack.pop();
            int sNum= Integer.parseInt(stack.pop());
            int result=0;
            if (operator.equals("+")){
                result= fNum+sNum;
            }else {
                result= fNum-sNum;
            }
            stack.push(String.valueOf(result));

        }
        System.out.println(stack.pop());
    }
}
