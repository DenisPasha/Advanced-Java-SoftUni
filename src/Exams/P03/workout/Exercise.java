package Exams.P03.workout;

public class Exercise {
    //•	name: String
    //•	muscle: String
    //•	burnedCalories: int

    private String name;
    private String muscle;
    private int burnedCalories;

    public Exercise(String name, String muscle, int burnedCalories) {
        this.name = name;
        this.muscle = muscle;
        this.burnedCalories = burnedCalories;
    }
    //The class constructor should receive name, muscle, and burnedCalories. You need to create the appropriate getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMuscle() {
        return muscle;
    }

    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }

    public int getBurnedCalories() {
        return burnedCalories;
    }

    public void setBurnedCalories(int burnedCalories) {
        this.burnedCalories = burnedCalories;
    }

    @Override
    public String toString(){
        StringBuilder sb  = new StringBuilder();
        sb.append(this.name).append(", ").append(this.muscle).append(", ").append(this.burnedCalories);
        return sb.toString();
    }

    // Override the ToString() method in the following format:
    //"Exercise: {name}, {muscle}, {burnedCalories}"
}
