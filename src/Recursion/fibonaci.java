package Recursion;

import java.util.Scanner;

public class fibonaci {
    static long[] memory;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());
        memory=new long [n+1];
        System.out.println(fib(n));
    }
    public static long fib(int n){

        if (n < 2){
            return n;
        }else {
            if (memory[n]!=0){
                return memory[n];
            }
            memory[n] =fib(n-1) + fib(n-2);
            return memory[n];

        }
    }
}
