package P06DefiningClasses.Exercises.SpeedRacing;

public class Car {
   private String model ;
    private double fuel;
    private double costPerKilometer;
    private int distanceTraveled;
    private static final int INITIAL_DISTANCE = 0;
    public Car(String model, int fuel, double costPerKilometer) {
        this.model = model;
        this.fuel = fuel;
        this.costPerKilometer = costPerKilometer;
        this.distanceTraveled = INITIAL_DISTANCE;

    }

    public void canMove(int amountOfKilometers){

        if (this.costPerKilometer * amountOfKilometers <= this.fuel){
            this.fuel = this.fuel - (this.costPerKilometer * amountOfKilometers);
            this.distanceTraveled = this.distanceTraveled + amountOfKilometers;
        }else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    public double getFuel() {
        return fuel;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public String getModel() {
        return model;
    }
}
