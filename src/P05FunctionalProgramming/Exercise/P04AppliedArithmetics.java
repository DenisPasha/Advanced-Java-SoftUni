package P05FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P04AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numsList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function< List<Integer> , List<Integer>> add = list -> list.stream().map(element -> element = element+1).collect(Collectors.toList());
        Function< List<Integer> , List<Integer>> subtract = list -> list.stream().map(element -> element = element-1).collect(Collectors.toList());
        Function< List<Integer> , List<Integer>> multiply = list -> list.stream().map(element -> element = element*2).collect(Collectors.toList());
        Consumer < List<Integer > > printer = list -> list.forEach(element -> System.out.print(element+" "));

        String command = scanner.nextLine();

        while (!command.equals("end")){

            if (command.equals("add")){
             numsList=   add.apply(numsList);
            } else if (command.equals("subtract")) {
              numsList=  subtract.apply(numsList);
            } else if (command.equals("multiply")) {
               numsList= multiply.apply(numsList);
            } else if (command.equals("print")) {
                printer.accept(numsList);
            }

            command=scanner.nextLine();
        }
    }
}
