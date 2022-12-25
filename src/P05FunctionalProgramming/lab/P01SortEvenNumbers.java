package P05FunctionalProgramming.lab;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class P01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArrOfStrings = scanner.nextLine().split(", ");

     List<Integer>evenNumbersList= Arrays.stream(inputArrOfStrings)
             .map(Integer::parseInt)
             .filter(e -> e % 2 == 0).toList();

     List<String>evenToStringList = new ArrayList<>();
        for (int i = 0; i < evenNumbersList.size(); i++) {
            evenToStringList.add(String.valueOf(evenNumbersList.get(i)));
        }
        System.out.println(String.join(", ",evenToStringList));

        evenToStringList = evenToStringList.stream()
                .map(Integer::parseInt).sorted(Integer::compareTo)
                .map(e->e.toString())
                .collect(Collectors.toList());

        System.out.println(String.join(", ",evenToStringList));

    }
}
