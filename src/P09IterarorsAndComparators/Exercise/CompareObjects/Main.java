package P09IterarorsAndComparators.Exercise.CompareObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> personList = new ArrayList<>();
        while (!input.equals("END")){
            String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);
            String town = input.split(" ")[2];

            Person person = new Person(name,age,town);
            personList.add(person);
            input = scanner.nextLine();
        }

        int index = Integer.parseInt(scanner.nextLine());
        Person person = personList.get(index-1);
        int equalPersons = 0;

        for (int i = 0; i < personList.size(); i++) {
            if (person.compareTo(personList.get(i))==0){
                equalPersons++;
            }
        }


        if (equalPersons==1){
            System.out.printf("No matches");
        }else {
            System.out.printf("%d %d %d",equalPersons,personList.size()- equalPersons,personList.size());
        }
    }
}
