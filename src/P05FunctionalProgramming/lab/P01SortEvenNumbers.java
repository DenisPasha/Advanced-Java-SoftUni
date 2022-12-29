package P05FunctionalProgramming.lab;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class P01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersArrStrings = scanner.nextLine().split(", ");

        Predicate<Integer> evenNum = e -> e % 2 ==0;
        Function<String,Integer> convertor = e -> Integer.parseInt(e);

        List<Integer> evenNumList= Arrays.stream(numbersArrStrings)
                .map(convertor)
                .filter(evenNum)
                .collect(Collectors.toList());

        String[] evenNumArrString = new String[evenNumList.size()];

        for (int i = 0; i < evenNumArrString.length; i++) {
            evenNumArrString[i] = String.valueOf(evenNumList.get(i));
        }

        System.out.println(String.join(", ",evenNumArrString));

        Collections.sort(evenNumList);

        String[] sortedNumsArr = new String[evenNumList.size()];
        for (int i = 0; i < sortedNumsArr.length; i++) {
            sortedNumsArr[i] = String.valueOf(evenNumList.get(i));
        }
        System.out.println(String.join(", ",sortedNumsArr));



    }
}
