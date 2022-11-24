package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        System.out.println(fac(n));

    }

    private static long fac(int n) {

       if(n <= 1){
           return 1;
       }
     long num= n * fac(n-1);
     return  num;

    }

}
