package P05FunctionalProgramming.lab;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P05FilterbyAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Integer>peoplesMap = new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {

            String[] inputArr = scanner.nextLine().split(", ");
            String name = inputArr[0];
            int age = Integer.parseInt(inputArr[1]);

            peoplesMap.put(name,age);
        }

        String condition = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        BiPredicate<Integer,Integer> filterPeopleByAge ;
        if (condition.equals("younger")){
            filterPeopleByAge =( personAge ,age ) -> personAge <=age;
        }else {
            filterPeopleByAge =( personAge ,age ) -> personAge >=age;
        }
        Consumer<Map.Entry<String,Integer>>printer;

        if (format.equals("age")){
            printer = person -> System.out.println(person.getValue());
        } else if (format.equals("name")) {
            printer = person -> System.out.println(person.getKey());
        }else {
            printer = person -> System.out.printf("%s - %d%n",person.getKey(),person.getValue());
        }


        peoplesMap.entrySet().stream()
                .filter( person -> filterPeopleByAge.test(person.getValue(),ageLimit))
                .forEach(printer);

    }
}
