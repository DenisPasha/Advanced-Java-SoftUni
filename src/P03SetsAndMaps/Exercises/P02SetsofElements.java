package P03SetsAndMaps.Exercises;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P02SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int firstSet = inputArr[0];
        int secondSet = inputArr[1];

        Set<Integer> set;
        Set<Integer> set2;

        set = IntStream.rangeClosed(1, firstSet).map(i -> Integer.parseInt(scanner.nextLine())).boxed().collect(Collectors.toCollection(LinkedHashSet::new));


        set2 = IntStream.rangeClosed(1, secondSet).map(i -> Integer.parseInt(scanner.nextLine())).boxed().collect(Collectors.toCollection(LinkedHashSet::new));

        set.retainAll(set2);
        set.forEach(elment -> System.out.printf("%d ",elment));



    }
}
