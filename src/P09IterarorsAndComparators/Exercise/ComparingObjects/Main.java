package P09IterarorsAndComparators.Exercise.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Person> personList = new ArrayList<>();
        while (!command.equals("END")){

            String name = command.split(" ")[0];
            int age = Integer.parseInt(command.split(" ")[1]);
            String town = command.split(" ")[2];

            Person person = new Person(name,age,town);
            personList.add(person);

            command=scanner.nextLine();
        }

        int n = Integer.parseInt(scanner.nextLine());

        Person searchedPerson = personList.get(n -1 );

        int count = 0;
        for (int i = 0; i < personList.size(); i++) {
            if (searchedPerson.compareTo(personList.get(i))==0){
                count ++;
            }
        }

        System.out.println(personList.size()-count+" "+count+" "+ personList.size() );
    }
}
