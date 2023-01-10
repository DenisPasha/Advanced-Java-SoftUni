package Exams.P01.shelter;

import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private List<Animal>data;

    private int capacity;

    public Shelter(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();

    }

    //•	Method add(Animal animal) – adds an entity to the data if there is an empty cell for the animal.

    public void add(Animal animal) {
        if (data.size() < capacity){
            data.add(animal);
        }
    }

    //•	Method remove(String name) – removes the animal by given name, if such exists, and returns boolean.

    public boolean remove(String name ){
        boolean isFound = false;
        for (int i = 0; i < data.size(); i++) {
            Animal animal = data.get(i);
            if (animal.getName().equals(name)){
                data.remove(i);
                isFound= true;
            }
        }
        return isFound;

    }
    //•	Method getAnimal(String name, String caretaker) –
    // returns the animal with the given name and caretaker or null if no such animal exists.

    public Animal getAnimal(String name, String caretaker){
        for (int i = 0; i < data.size(); i++) {
            Animal animal = data.get(i);
            if (animal.getName().equals(name) && animal.getCaretaker().equals(caretaker)){
                return animal;
            }
        }
        return null;
    }
    //•	Method getOldestAnimal() – returns the oldest Animal.
    public Animal getOldestAnimal(){
        int oldestAge = 0;
        Animal oldestAnimal = null;
        for (int i = 0; i < data.size(); i++) {
            Animal animal = data.get(i);
            if (animal.getAge() > oldestAge){
                oldestAge = animal.getAge();
                oldestAnimal = animal;
            }
        }
        return oldestAnimal;
    }
    //•	Getter getCount – returns the number of animals.

    public int getCount (){
       return data.size();
    }

    //•	getStatistics() – returns a String in the following format:
    //o	"The shelter has the following animals:
    //{name} {caretaker}
    //{name} {caretaker}

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            Animal animal = data.get(i);
            sb.append(animal.getName()).append(" ").append(animal.getCaretaker()).append(System.lineSeparator());
        }
        return sb.toString();
    }


}
