package P08Generic.lab.Jar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jar jar = new Jar<>();
        jar.add(32);
        jar.add("pesho");
        jar.add("32");

        System.out.println();
    }
}
