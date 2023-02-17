package Exams.P05.parrots;

public class Parrot {
    //•	name: String
    //•	species: String
    //•	available: boolean - true by default
    private String name ;
    private String species;
    private boolean available ;

    public Parrot(String name, String species) {
        this.name = name;
        this.species = species;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = true;
    }

    public String toString(){
       return String.format("Parrot (%s): %s",this.species,this.name);

    }
}
