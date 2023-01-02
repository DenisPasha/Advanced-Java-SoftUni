package P06DefiningClasses.Exercises.SalesMan;

public class Engine {
    //Model} {Power} {Displacement} {Efficiency}".
    private String engineModel;
    private String enginePower;
    private int engineDisplacement;
    private String engineEfficiency;

    public String getEngineModel() {
        return engineModel;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public String getEngineEfficiency() {
        return engineEfficiency;
    }

    public Engine(String engineModel, String enginePower) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.engineDisplacement = Integer.parseInt("n/a");
        this.engineEfficiency = "n/a";
    }

    public Engine(String engineModel, String enginePower, int engineDisplacement) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.engineDisplacement = engineDisplacement;
        this.engineEfficiency = "n/a";
    }

    public Engine(String engineModel, String enginePower, String engineEfficiency) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.engineEfficiency = engineEfficiency;
        this.engineDisplacement = 0;
    }

    public Engine(String engineModel, String enginePower, int engineDisplacement, String engineEfficiency) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.engineDisplacement = engineDisplacement;
        this.engineEfficiency = engineEfficiency;
    }

}
