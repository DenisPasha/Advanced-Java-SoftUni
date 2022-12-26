package P05FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class P02KnightsofHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String>namePrinter = name-> System.out.println("Sir "+name);
        List<String>namesList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        namesList.stream().forEach(namePrinter);

    }
}
