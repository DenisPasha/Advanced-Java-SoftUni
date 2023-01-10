package P09IterarorsAndComparators.Exercise.StrategyPattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());
        List<Person> personList=new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            String personDetails = scanner.nextLine();
            String name = personDetails.split(" ")[0];
            int age = Integer.parseInt(personDetails.split(" ")[1]);

            Person person = new Person(name,age);
            personList.add(person);
        }




        Comparator<Person> nameComparator = new PersonNameComparator();
        TreeSet<Person> nameSet = new TreeSet<>(nameComparator);
        nameSet.addAll(personList);
        nameSet.forEach(person -> System.out.println(person));

        Comparator<Person> ageComparator = new PersonAgeComparator();
        TreeSet<Person> ageSet = new TreeSet<>(ageComparator);
        ageSet.addAll(personList);
        ageSet.forEach(person -> System.out.println(person));



    }
}
