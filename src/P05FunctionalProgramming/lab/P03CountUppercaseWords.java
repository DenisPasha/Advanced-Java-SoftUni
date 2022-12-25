package P05FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String>isUppercasePredicate = word -> Character.isUpperCase(word.charAt(0));
        List<String>upperCaseList = Arrays.stream(scanner.nextLine().split(" "))
                .filter(isUppercasePredicate).collect(Collectors.toList());
        System.out.println(upperCaseList.size());

        Consumer<String>printer = word -> System.out.println(word);
        upperCaseList.stream().forEach(printer);
    }
}
