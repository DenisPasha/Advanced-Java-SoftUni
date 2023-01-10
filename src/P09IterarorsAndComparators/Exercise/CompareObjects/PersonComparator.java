package P09IterarorsAndComparators.Exercise.CompareObjects;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        //comparing by age
      return Integer.compare(person1.getAge(),person2.getAge());
        //comparing by name
      // return person1.getName().compareTo(person2.getName());

    }
}
