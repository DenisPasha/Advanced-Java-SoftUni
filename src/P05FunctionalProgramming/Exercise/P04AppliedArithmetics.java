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

        String command = scanner.nextLine();
     Function<List<Integer> , List<Integer>> addd = list -> list.stream().map(number -> number+=1).collect(Collectors.toList());
     Function<List<Integer> , List<Integer>> multiply = list -> list.stream().map(number -> number*=2).collect(Collectors.toList());
     Function<List<Integer> , List<Integer>> subtract = list -> list.stream().map(number -> number-=1).collect(Collectors.toList());
     Consumer< List<Integer>> print = list -> list.forEach(number -> System.out.print(number + " "));

        while (!command.equals("end")){
            
            if (command.equals("add")){
              numsList=  addd.apply(numsList);
            } else if (command.equals("multiply")) {
               numsList= multiply.apply(numsList);
            } else if (command.equals("subtract")) {
                numsList=subtract.apply(numsList);
            } else if (command.equals("print")) {
                print.accept(numsList);
                System.out.println();
            }

            command=scanner.nextLine();
        }
    }
}
