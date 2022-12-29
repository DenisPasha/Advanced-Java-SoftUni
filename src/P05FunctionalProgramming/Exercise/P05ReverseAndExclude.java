package P05FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

       Collections.reverse(inputList);
       int n = Integer.parseInt(scanner.nextLine());
       Predicate<Integer> predicate = num -> num % n ==0;
       inputList.removeIf(predicate);
       inputList.forEach(e -> System.out.print(e+" "));
    }
}
