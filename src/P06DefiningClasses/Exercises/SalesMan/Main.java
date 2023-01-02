package P06DefiningClasses.Exercises.SalesMan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Engine > engineList = new ArrayList<>();
        List<Car> carList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] engineInputArr = scanner.nextLine().split(" ");

            String engineModel = engineInputArr[0];
            String enginePower = engineInputArr[1];

            if (engineInputArr.length == 4) {
                int engineDisplacement = Integer.parseInt(engineInputArr[2]);
                String engineEfficiency = engineInputArr[3];

                Engine engine = new Engine(engineModel, enginePower, engineDisplacement, engineEfficiency);
                engineList.add(engine);

            } else if (engineInputArr.length == 2) {
                Engine engine = new Engine(engineModel, enginePower);
                engineList.add(engine);
            } else {
                String thirdElement = engineInputArr[2];
                if (thirdElement.length() > 1) {
                    int engineDisplacement = Integer.parseInt(thirdElement);
                    Engine engine = new Engine(engineModel, enginePower, engineDisplacement);
                    engineList.add(engine);
                } else {
                    String engineEfficiency = thirdElement;
                    Engine engine = new Engine(engineModel, enginePower, engineEfficiency);
                    engineList.add(engine);
                }
            }
        }


            int m = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < m; j++) {
                String[] carInputArr = scanner.nextLine().split(" ");
                //Model} {Engine} {Weight} {Color}",

                if (carInputArr.length == 2){
                    String carModel = carInputArr[0];
                    String carEngineModel = carInputArr[1];
                    Car car = new Car(carModel,carEngineModel);
                    carList.add(car);
                } else if (carInputArr.length == 4) {
                    String carModel = carInputArr[0];
                    String carEngineModel = carInputArr[1];
                    int carWeight = Integer.parseInt(carInputArr[2]);
                    String carColour = carInputArr[3];

                    Car car = new Car(carModel,carEngineModel,carWeight,carColour);
                    carList.add(car);
                }else {
                    String thirdElement = carInputArr[2];
                    if (Character.isDigit(thirdElement.charAt(0))){
                        String carModel = carInputArr[0];
                        String carEngineModel = carInputArr[1];
                        int carWeight = Integer.parseInt(thirdElement);

                        Car car = new Car(carModel,carEngineModel,carWeight);
                        carList.add(car);
                    }else {
                        String carModel = carInputArr[0];
                        String carEngineModel = carInputArr[1];
                        String carColour = thirdElement;

                        Car car = new Car(carModel,carEngineModel,carColour);
                        carList.add(car);
                    }
                }
            }

        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);

            String carModel = car.getCarModel();
            String carEngine = car.getCarEngineModel();
            String carWeight = String.valueOf(car.getCarWeight());
            if (carWeight.equals("0")){
                carWeight = "n/a";
            }
            String carColour = car.getCarColour();

            for (int j = 0; j < engineList.size(); j++) {
                Engine engine = engineList.get(j);
                String engineModel = engine.getEngineModel();

                if (carEngine.equals(engineModel)){
                    String enginePower = engine.getEnginePower();
                    String displacement = String.valueOf(engine.getEngineDisplacement());
                    if (displacement.equals("0")){
                        displacement = "n/a";
                    }
                    String efficiency = engine.getEngineEfficiency();

                    System.out.printf("%s:\n" +
                            "%s:\n" +
                            "Power: %s\n" +
                            "Displacement: %s\n" +
                            "Efficiency: %s\n" +
                            "Weight: %s\n" +
                            "Color: %s\n",carModel,carEngine,enginePower,displacement,efficiency,carWeight,carColour);
                }
            }

        }
    }
}
