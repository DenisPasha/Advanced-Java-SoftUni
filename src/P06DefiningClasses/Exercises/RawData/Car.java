package P06DefiningClasses.Exercises.RawData;

public class Car {
   private String carModel;
   private Engine engine;
   private Cargo cargo;
   private Tyres tyres;

   public Car(String carModel, Engine engine, Cargo cargo, Tyres tyres) {
      this.carModel = carModel;
      this.engine = engine;
      this.cargo = cargo;
      this.tyres = tyres;
   }

   public String getCarModel() {
      return carModel;
   }

   public Engine getEngine() {
      return engine;
   }

   public Cargo getCargo() {
      return cargo;
   }

   public Tyres getTyres() {
      return tyres;
   }
}
