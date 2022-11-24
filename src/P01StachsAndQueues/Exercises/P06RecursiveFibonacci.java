package P01StachsAndQueues.Exercises;

import java.util.Scanner;

public class P06RecursiveFibonacci {
    public static long memory[];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
         memory = new long[n + 1];
       long fibonacci= fib(n);
        System.out.println(fibonacci);
    }

   public static long fib(int n){

       if (n < 2){
           return n;
       }
       else
           if (memory[n]!=0){
               return memory[n];
           }
           memory[n]=fib(n-1)+fib(n-2);
           return memory[n];
   }
}
