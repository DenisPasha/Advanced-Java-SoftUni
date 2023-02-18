package Exam2023JavaAdvanced.kindergarten;

import java.util.ArrayList;
import java.util.List;

public class Kindergarten {
    //•	name: String
    //•	capacity: int
    //•	registry: List<Child>

    private String name ;
    private int capacity;
    private List<Child> registry;

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    public boolean addChild(Child child){
        if (this.capacity > this.registry.size()){
           return this.registry.add(child);
        }else {
            return false;
        }
    }

    public boolean removeChild(String firstName){
        for (int i = 0; i < this.registry.size(); i++) {
            Child currentChild = this.registry.get(i);
            if (currentChild.getFirstName().equals(firstName)){
                return this.registry.remove(currentChild);
            }
        }
        return false;
    }

    public int getChildrenCount(){
        return this.registry.size();
    }

    public Child getChild(String firstName){
        for (int i = 0; i < this.registry.size(); i++) {
            Child currentChild = this.registry.get(i);
            if (currentChild.getFirstName().equals(firstName)){
                return currentChild;
            }
        }
        return null;
    }

    public String registryReport(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Registered children in %s:",this.name)).append(System.lineSeparator()).append("--").append(System.lineSeparator());

        for (int i = 0; i < this.registry.size() - 1; i++) {
            Child currentChild = this.registry.get(i);
            sb.append(currentChild).append(System.lineSeparator()).append("--").append(System.lineSeparator());
        }
        sb.append(this.registry.get(this.registry.size()-1));
       return sb.toString();
    }

}
