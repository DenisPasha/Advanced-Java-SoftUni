package P09IterarorsAndComparators.Exercise.StrategyPattern;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        int result = Integer.compare(person1.getName().length(),person2.getName().length());
        if (result==0){
            String one = String.valueOf(person1.getName().charAt(0));
            String two = String.valueOf(person2.getName().charAt(0));

           one = one.toUpperCase();
           two = two.toUpperCase();
          result = one.compareTo(two);
        }
        return result;
    }
}
