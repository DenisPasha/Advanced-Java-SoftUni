package P01StachsAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        StringBuilder sb=new StringBuilder();
        ArrayDeque<String>stack=new ArrayDeque<>();


        for (int i = 1; i <=n ; i++) {

            String input=scanner.nextLine();
            String[] inputArr= input.split(" ");
            
            int command= Integer.parseInt(inputArr[0]);

            if (command==1){
                //append
                stack.push(sb.toString());
                sb.append(inputArr[1]);
            } else if (command==2) {
                //delete
                stack.push(sb.toString());
                int count= Integer.parseInt(inputArr[1]);
                sb.replace(sb.length()-count,sb.length(),"");

            } else if (command==3) {
                //returns element
                int index= Integer.parseInt(inputArr[1]);
                char current=sb.charAt(index-1);
                System.out.println(current);
            } else if (command==4) {
               sb.replace(0,sb.length(),stack.pop());

            }

        }

    }
}
