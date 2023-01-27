package P05FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class P02KnightsofHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
    Consumer<String> consumer = element -> System.out.println("Sir "+element);
        for (int i = 0; i < inputList.size(); i++) {
            String name = inputList.get(i);
            consumer.accept(name);
        }

    }
}
