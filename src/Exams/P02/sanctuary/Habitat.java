package Exams.P02.sanctuary;

import java.util.ArrayList;
import java.util.List;

public class Habitat {
    private List<Elephant> data;
    private int capacity;

    public Habitat(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    //•	Field data – List that holds added elephants
    //•	Method add(Elephant elephant) – adds an entity to the data if there is an empty space for the elephant.
    public void add(Elephant elephant){
        if (this.data.size() < this.capacity){
            this.data.add(elephant);
        }
    }

    //•	Method remove(String name) – removes the elephant by given name, if such exists, and returns boolean.

    public boolean remove(String name ){
        for (int i = 0; i < this.data.size(); i++) {
            Elephant elephant = data.get(i);
            if (elephant.getName().equals(name)){
              this.data.remove(elephant);
                return true;
            }
        }
        return false;
    }
    //•	Method getElephant(String retiredFrom) – returns the elephant retired from the given place or null if no such elephant exists.

    public Elephant getElephant(String retiredFrom){
        for (int i = 0; i < this.data.size(); i++) {
            Elephant elephant = this.data.get(i);
            if (elephant.getRetiredFrom().equals(retiredFrom)){
                return elephant;
            }
        }
        return null;
    }
    //•	Method getOldestElephant() – returns the oldest Elephant.

    public Elephant getOldestElephant(){
        Elephant oldestElephant = null;
        int oldestAge = 0;
        for (int i = 0; i < this.data.size(); i++) {
            Elephant elephant = this.data.get(i);
            if (elephant.getAge() > oldestAge){
                oldestAge = elephant.getAge();
                oldestElephant = elephant;
            }
        }
        return oldestElephant;
    }
    //•	Getter getAllElephants() – returns the number of elephants.

    public int getAllElephants(){
       return this.data.size();
    }
    //•	getReport() – returns a String in the following format:
    //"Saved elephants in the park:
    //		 {name} came from: {retiredFrom}
    //          {name} came from: {retiredFrom}
    //          (…)"

    public String getReport(){
        System.out.println("Saved elephants in the park:");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.data.size(); i++) {
            Elephant elephant = this.data.get(i);
            sb.append(elephant.getName()).append(" came from: ").append(elephant.getRetiredFrom()).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

}
