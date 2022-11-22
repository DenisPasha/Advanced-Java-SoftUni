package P01StachsAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal=Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer>stack=new ArrayDeque<>();

        while (decimal !=0 ){
            stack.push(decimal % 2);
            decimal=decimal/2;
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
