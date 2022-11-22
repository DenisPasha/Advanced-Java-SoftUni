package P01StachsAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String>queue=new ArrayDeque<>();

        String input=scanner.nextLine();
        while (!input.equals("print")){

            if (!input.equals("cancel")){
                queue.offer(input);
            }else {
                if (queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.printf("Canceled %s%n",queue.poll());
                }

            }

            input=scanner.nextLine();
        }

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
