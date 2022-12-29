package P05FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>,Integer> function = list -> Collections.min(numsList);
        System.out.println(function.apply(numsList));
    }
}
