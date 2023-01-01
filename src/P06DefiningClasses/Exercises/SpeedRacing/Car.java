package P06DefiningClasses.Exercises.SpeedRacing;

public class Car {

    private String model;
    private double fuel;
    private  double fuelCostPerKm;
    private double distanceTraveled;

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setFuelCostPerKm(double fuelCostPerKm) {
        this.fuelCostPerKm = fuelCostPerKm;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public Car(String model, double fuel, double fuelCostPerKm) {
        this.model = model;
        this.fuel = fuel;
        this.fuelCostPerKm = fuelCostPerKm;
        this.distanceTraveled = 0;
    }

    public String getModel() {
        return model;
    }

    public double getFuel() {
        return fuel;
    }

    public double getFuelCostPerKm() {
        return fuelCostPerKm;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void canReach(String carModel, double kilometers){

       double neededLitres = kilometers * this.fuelCostPerKm;

       if (neededLitres < this.fuel){
           this.fuel = this.fuel - neededLitres;
           this.distanceTraveled = this.distanceTraveled + kilometers;
       }else {
           System.out.println("Insufficient fuel for the drive");
       }

    }



}
