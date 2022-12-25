package P05FunctionalProgramming.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P06FindEvensorOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int start = range[0];
        int end = range[1];

        List<Integer>numsList = new ArrayList<>();

        for (int i = start; i <=end ; i++) {
            numsList.add(i);
        }
        
        String condition = scanner.nextLine();
        Predicate<Integer>predicate;

        if (condition.equals("even")){
            predicate = e -> e % 2==0;
        }else {
            predicate = e -> e % 2 !=0;
        }

        numsList.stream().filter(predicate).forEach(e-> System.out.printf(e+" "));
    }
}
