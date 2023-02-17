package Exams.P08.groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    //•	capacity: int
    private int capacity ;
    private List<Pet> data;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    //•	Method add(Pet pet) – adds an entity to the data if there is an empty place in the grooming salon for the pet.
    public void add(Pet pet){
        if (this.capacity > this.data.size()){
            this.data.add(pet);
        }
    }
    //•	Method remove(String name) – removes the pet by given name, if such exists, and returns boolean.
    public boolean remove(String name){
        for (int i = 0; i < this.data.size(); i++) {
            Pet pet = this.data.get(i);
            if (pet.getName().equals(name)){
              return this.data.remove(pet);

            }
        }
        return false;
    }
    //•	Method getPet(String name, String owner) – returns the pet with the given name and owner or null if no such pet exists.
    public Pet getPet(String name , String owner){
        for (int i = 0; i < this.data.size(); i++) {
            Pet pet = this.data.get(i);
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)){
                return pet;
            }
        }
        return null;
    }
    //•	Getter getCount – returns the number of pets.
    public int getCount(){
       return this.data.size();
    }
    //•	getStatistics() – returns a String in the following format:
    //o	" The grooming salon has the following clients:
    //{name} {owner}
    //{name} {owner}
    //   (…)"
    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("The grooming salon has the following clients:").append(System.lineSeparator());
        for (int i = 0; i < this.data.size(); i++) {
            Pet pet = this.data.get(i);
            sb.append(String.format("%s %s",pet.getName(),pet.getOwner())).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
