package P06DefiningClasses.Exercises.OpinionPoll;

import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<OpinionPoll> peopleList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String person = scanner.nextLine();

            String name = person.split("\\s+")[0];
            int age = Integer.parseInt(person.split("\\s+")[1]);

            OpinionPoll opinionPoll = new OpinionPoll(name,age);
            peopleList.add(opinionPoll);
        }

       peopleList.sort(Comparator.comparing(person->person.name));
        peopleList.stream().filter(object -> object.getAge()>30).forEach(person-> System.out.printf("%s - %d%n",person.getName(),person.age));

    }
}
