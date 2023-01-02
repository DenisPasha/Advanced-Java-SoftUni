package P06DefiningClasses.Exercises.SalesMan;

public class Car {
    //Model} {Engine} {Weight} {Color}",
    private String carModel;
    private String carEngineModel;
    private int carWeight;
    private String carColour;

    public Car(String carModel, String carEngineModel) {
        this.carModel = carModel;
        this.carEngineModel = carEngineModel;
        this.carColour = "n/a";
        this.carWeight = 0;
    }

    public Car(String carModel, String carEngineModel, int carWeight, String carColour) {
        this.carModel = carModel;
        this.carEngineModel = carEngineModel;
        this.carWeight = carWeight;
        this.carColour = carColour;
    }

    public Car(String carModel, String carEngineModel, int carWeight) {
        this.carModel = carModel;
        this.carEngineModel = carEngineModel;
        this.carWeight = carWeight;
        this.carColour = "n/a";
    }

    public Car(String carModel, String carEngineModel, String carColour) {
        this.carModel = carModel;
        this.carEngineModel = carEngineModel;
        this.carColour = carColour;
        this.carWeight = 0;

    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarEngineModel() {
        return carEngineModel;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public String getCarColour() {
        return carColour;
    }
}
