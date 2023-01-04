package P08Generic.lab.GenericScale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GenericScale <Integer> genericScale = new GenericScale<>(2,21);
        GenericScale <String> genericScale1 = new GenericScale<>("dada","dadaa");

        ;
        System.out.println(genericScale1.getHeavier());
        System.out.println();
    }
}
