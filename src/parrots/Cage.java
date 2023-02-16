package parrots;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    //•	name: String
    //•	capacity: int
    //•	data: List<Parrot> that holds added parrots
    private String name ;
    private int capacity;
    private List<Parrot> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    //•	getName()
    public String getName(){
       return this.name;
    }
    //•	getCapacity()
    public int getCapacity(){
       return this.capacity;
    }
    //•	add(Parrot parrot) method - adds an entity to the data if there is room for it
    public void add(Parrot parrot){
        if (this.capacity > this.data.size()){
            this.data.add(parrot);
        }
    }
    //•	remove(String name) method - removes a parrot by given name, if such exists, and returns boolean
    public boolean remove(String name){
        for (int i = 0; i < this.data.size(); i++) {
            Parrot parrot = this.data.get(i);
            if (parrot.getName().equals(name)){
               return this.data.remove(parrot);
            }
        }
        return false;
    }
    //•	sellParrot(String name) method - sell (set its available property to false without removing it from the collection) the first parrot with the given name, also return the parrot
    public Parrot sellParrot(String name){
        for (int i = 0; i < this.data.size(); i++) {
            Parrot parrot = this.data.get(i);
            if (parrot.getName().equals(name)){
                parrot.setAvailable(false);
                return parrot;
            }
        }
        return null;
    }
    //•	sellParrotBySpecies(String species) method - sells and returns all parrots from that species as a List
    public List<Parrot> sellParrotBySpecies(String species){
        List<Parrot> parrotList = new ArrayList<>();
        for (int i = 0; i < this.data.size(); i++) {
            Parrot parrot = this.data.get(i);
            if (parrot.getSpecies().equals(species)){
                parrot.setAvailable(false);
                parrotList.add(parrot);
            }
        }
        return parrotList;
    }
    //•	count() - returns the number of parrots
    public int count(){
       return this.data.size();
    }
    //•	report() - returns a String in the following format, including only not sold parrots:
    //o	"Parrots available at {cageName}:
    //{Parrot 1}
    //{Parrot 2}

    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Parrots available at %s:",this.name)).append(System.lineSeparator());
        for (int i = 0; i < this.data.size(); i++) {
            Parrot parrot = this.data.get(i);
            if (parrot.isAvailable()){
                sb.append(parrot.toString()).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
