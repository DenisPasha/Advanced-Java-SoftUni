package GenericScale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scale<Integer> genericScale = new Scale<>(2,21);
        Scale<String> genericScale1 = new Scale<>("dada","dadaa");

        ;
        System.out.println(genericScale1.getHeavier());
        System.out.println();
    }
}
