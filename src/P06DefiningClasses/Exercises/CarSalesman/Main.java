package P06DefiningClasses.Exercises.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new ArrayList<>();
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] engineInputArr = scanner.nextLine().split(" ");
            String engineModel = engineInputArr[0];
            String enginePower = engineInputArr[1];

            Engine engine = createEngine(engineInputArr, engineModel, enginePower);
            engineList.add(engine);
        }

        int m = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < m; i++) {
            String[] carInputArr = scanner.nextLine().split(" ");

            String carModel = carInputArr[0];
            String carEngine = carInputArr[1];
            Engine wantedEngine = null;

            for (Engine engine : engineList) {
                if (engine.getEngineModel().equals(carEngine)) {
                    wantedEngine = engine;
                }
            }

            createCar(carList, carInputArr, carModel, wantedEngine);
        }

        for (Car car : carList) {
            System.out.println(car.toString());
        }
    }

    private static void createCar(List<Car> carList, String[] carInputArr, String carModel, Engine wantedEngine) {
        if (carInputArr.length == 4){
            String carWeight = carInputArr[2];
            String carColour = carInputArr[3];
            Car car = new Car();
            addFirstTwoElementsToCar(carModel, wantedEngine, car);
            car.setWeight(carWeight);
            car.setColour(carColour);
            carList.add(car);

        } else if (carInputArr.length == 2) {
            Car car = new Car();
            addFirstTwoElementsToCar(carModel, wantedEngine, car);
            car.setWeight("n/a");
            car.setColour("n/a");
            carList.add(car);
        }else {
            String thirdElement = carInputArr[2];
            if (Character.isDigit(thirdElement.charAt(0))){
                String carWeight = thirdElement;
                Car car = new Car();
                addFirstTwoElementsToCar(carModel, wantedEngine, car);
                car.setWeight(carWeight);
                car.setColour("n/a");
                carList.add(car);
            }else {
                String carColour = thirdElement;
                Car car = new Car();
                addFirstTwoElementsToCar(carModel, wantedEngine, car);
                car.setColour(carColour);
                car.setWeight("n/a");
                carList.add(car);
            }
        }
    }

    private static void addFirstTwoElementsToCar(String carModel, Engine wantedEngine, Car car) {
        car.setCarModel(carModel);
        car.setEngine(wantedEngine);
    }

    private static Engine createEngine(String[] engineInputArr, String engineModel, String enginePower) {
        Engine engine = new Engine();
        if (engineInputArr.length == 4){
            String engineDisplacement = engineInputArr[2];
            String engineEfficiency = engineInputArr[3];

            addFirstTwoElementsToEngine(engineModel, enginePower, engine);
            engine.setEngineDisplacement(engineDisplacement);
            engine.setEngineEfficiency(engineEfficiency);

        } else if (engineInputArr.length == 2) {
            addFirstTwoElementsToEngine(engineModel, enginePower, engine);
            engine.setEngineDisplacement("n/a");
            engine.setEngineEfficiency("n/a");
        } else if (engineInputArr.length == 3) {
            String thirdElement = engineInputArr[2];
            if (Character.isDigit(thirdElement.charAt(0))){
                String engineDisplacement = thirdElement;
                addFirstTwoElementsToEngine(engineModel, enginePower, engine);
                engine.setEngineDisplacement(engineDisplacement);
                engine.setEngineEfficiency("n/a");
            }else {
                String engineEfficiency = thirdElement;
                addFirstTwoElementsToEngine(engineModel, enginePower, engine);
                engine.setEngineEfficiency(engineEfficiency);
                engine.setEngineDisplacement("n/a");
            }
        }
        return engine;
    }

    private static void addFirstTwoElementsToEngine(String engineModel, String enginePower, Engine engine) {
        engine.setEngineModel(engineModel);
        engine.setEnginePower(enginePower);
    }
}
