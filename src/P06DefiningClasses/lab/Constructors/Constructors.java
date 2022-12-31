package P06DefiningClasses.lab.Constructors;

public class Constructors {

   private String brand;
   private String model;
   private int horsePower;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Constructors(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }

}
