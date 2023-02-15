package hotel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

public class Hotel {
    //•	name: String
    //•	capacity: int

    private String name ;
    private int capacity;

    private List<Person> roaster;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roaster = new ArrayList<>();
    }

    //•	Method add(Person person) - adds an entity to the roster if there is room for it
    public void add(Person person){
        if (this.capacity > this.roaster.size()){
            this.roaster.add(person);
        }
    }
    //•	Method remove(String name) - removes a person by given name, if such exists, and returns boolean
    public boolean remove(String name){

        for (int i = 0; i < this.roaster.size(); i++) {
            Person currentPerson = this.roaster.get(i);
            if (currentPerson.getName().equals(name)){
             return this.roaster.remove(currentPerson);
            }
        }
        return false;
    }
    //•	Method getPerson(String name, String hometown) – returns the people with the given name and hometown or null if there is no such person.
    public Person getPerson(String name , String hometown){

        for (int i = 0; i < this.roaster.size(); i++) {
            Person currentPerson = this.roaster.get(i);
            if (currentPerson.getName().equals(name) && currentPerson.getHometown().equals(hometown)){
                return currentPerson;
            }
        }
        return null;
    }
    //•	Getter getCount() – returns the number of people.
    public int getCount(){
        return this.roaster.size();
    }
    //•	getStatistics() – returns a String in the following format:
    //o	"The people in the hotel {name} are:
    //{Person1}
    //{Person2}
    public String getStatistics(){

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The people in the hotel %s are:",this.name)).append(System.lineSeparator());
        for (Person currentPerson : this.roaster) {
            sb.append(currentPerson).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
