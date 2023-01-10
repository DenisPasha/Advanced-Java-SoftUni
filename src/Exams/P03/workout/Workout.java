package Exams.P03.workout;

import java.util.ArrayList;
import java.util.List;

public class Workout {
    private List<Exercise> exercises;
    private String type;
    private int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }

    //•	Method addExercise(Exercise exercise) – adds an entity to the exercises If there is still space on the workout sheet (exerciseCount).
    public void addExercise(Exercise exercise){
        if (this.exerciseCount > this.exercises.size()){
            this.exercises.add(exercise);
        }
    }

    //•	Method removeExercise(String name, String muscle) – removes the exercise by given name and muscle, if such exists, and returns boolean.

    public boolean removeExercise(String name ,String muscle){
        for (int i = 0; i < this.exercises.size(); i++) {
            Exercise exercise = this.exercises.get(i);

            if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)){
                this.exercises.remove(exercise);
                return true;
            }
        }
        return false;
    }
    //•	Method getExercise(String name, String muscle) – returns the exercise with the given name and muscle or null if there is no such exercise.

    public Exercise getExercise(String name , String muscle){
        for (int i = 0; i < this.exercises.size(); i++) {
            Exercise exercise = this.exercises.get(i);
            if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)){
                return exercise;
            }
        }
        return null;
    }
    //•	Method getMostBurnedCaloriesExercise() – returns the exercise which is burned the most calories or null if there are no exercises.

    public Exercise getMostBurnedCaloriesExercise(){
        int mostBurnedCalories = 0;
        Exercise wantedExercise = null;

        for (int i = 0; i < this.exercises.size(); i++) {
            Exercise exercise = this.exercises.get(i);
            if (exercise.getBurnedCalories() > mostBurnedCalories){
                mostBurnedCalories = exercise.getBurnedCalories();
                wantedExercise = exercise;
            }
        }
        return wantedExercise;

    }
    //•	Getter getExerciseCount() – returns the number of exercises.
    public int getExerciseCount() {
        return this.exercises.size();
    }
    //•	getStatistics() – returns a String in the following format:
    //o	"Workout type: {workout type}
    //Exercise: {Exercise1}
    //Exercise: {Exercise2}
    //(…)"

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        System.out.printf("Workout type: ",this.type);
        for (int i = 0; i < this.exercises.size(); i++) {
            Exercise exercise = this.exercises.get(i);
            sb.append("Exercise: ").append(exercise.getName()).append(", ").append(exercise.getName()).append(", ")
                    .append(exercise.getBurnedCalories()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
