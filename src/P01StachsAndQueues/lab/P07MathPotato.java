package P01StachsAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());

        String[] data = scanner.nextLine().split(" ");
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, data);

        for (int i = 1; i <=n ; i++) {
            int counter=0;
            for (int j = 1; j <=n ; j++) {

                if (i % j==0){
                    counter++;
                }
            }
            if (counter!=2){


            }
        }
        

    }

}
