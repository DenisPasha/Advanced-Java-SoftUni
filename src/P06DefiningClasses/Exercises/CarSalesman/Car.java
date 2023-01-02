package P06DefiningClasses.Exercises.CarSalesman;

public class Car {

    //Car has a model, engine, weight, and color

    private String carModel;
    private Engine engine;
    private String weight;
    private String colour;

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString(){
        String carModel = this.getCarModel();
        String carEngineModel = this.getEngine().getEngineModel();
        String enginePower = this.getEngine().getEnginePower();
        String engineDisplacement = this.getEngine().getEngineDisplacement();
        String engineEfficiency = this.getEngine().getEngineEfficiency();
        String carWeight = this.getWeight();
        String carColour = this.getColour();

      String text = String.format("%s:\n" +
            "%s:\n" +
            "Power: %s\n" +
            "Displacement: %s\n" +
            "Efficiency: %s\n" +
            "Weight: %s\n" +
            "Color: %s",carModel,carEngineModel,enginePower,engineDisplacement,engineEfficiency,carWeight,carColour);


      return text;
    }
}
