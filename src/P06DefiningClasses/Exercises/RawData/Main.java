package P06DefiningClasses.Exercises.RawData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String , Car> map =new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            String model = inputArr[0];
            int engineSpeed = Integer.parseInt(inputArr[1]);
            int enginePower = Integer.parseInt(inputArr[2]);
            int cargoWeight = Integer.parseInt(inputArr[3]);
            String cargoType = inputArr[4];
            double tyrePressureOne = Double.parseDouble(inputArr[5]);
            int tyreAgeOne = Integer.parseInt(inputArr[6]);
            double tyrePressureTwo = Double.parseDouble(inputArr[7]);
            int tyreAgeTwo = Integer.parseInt(inputArr[8]);
            double tyrePressureThree = Double.parseDouble(inputArr[9]);
            int tyreAgeThree = Integer.parseInt(inputArr[10]);
            double tyrePressureFour = Double.parseDouble(inputArr[11]);
            int tyreAgeFour = Integer.parseInt(inputArr[12]);

            Engine engine = new Engine(engineSpeed,enginePower);
            Cargo cargo = new Cargo(cargoWeight,cargoType);
            Tyres tyres = new Tyres(tyreAgeOne,tyreAgeTwo,tyreAgeThree,tyreAgeFour,tyrePressureOne,tyrePressureTwo,tyrePressureThree,tyrePressureFour);

            Car car = new Car(model,engine,cargo,tyres);
            map.put(model,car);

        }

        String command = scanner.nextLine();

        if (command.equals("fragile")){

            for (Map.Entry<String, Car> entry : map.entrySet()) {

                Car car = entry.getValue();
              if (car.getCargo().getCargoType().equals("fragile")){
                  if (car.getTyres().getTyreOnePressure() < 1 || car.getTyres().getTyreTwoPressure() < 1 || car.getTyres().getTyreThreePressure() < 1
                  || car.getTyres().getTyreFourPressure() < 1 ){
                      System.out.println(car.getCarModel());
                  }
                }

            }


        } else if (command.equals("flamable")) {

            for (Map.Entry<String, Car> entry : map.entrySet()) {
                Car car = entry.getValue();

                if (car.getCargo().getCargoType().equals("flamable")){
                    if (car.getEngine().getPower() > 250){
                        System.out.println(car.getCarModel());
                    }
                }
            }

        }
    }
}
