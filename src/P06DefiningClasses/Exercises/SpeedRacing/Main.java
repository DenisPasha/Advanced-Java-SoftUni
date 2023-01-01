package P06DefiningClasses.Exercises.SpeedRacing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String , Car> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] inputArr = scanner.nextLine().split("\\s+");
            String model = inputArr[0];
            double fuelAmount = Double.parseDouble(inputArr[1]);
            double fuelCostPerKm = Double.parseDouble(inputArr[2]);

            Car car = new Car(model,fuelAmount,fuelCostPerKm);
            map.put(model,car);
        }

        String[] commandArr = scanner.nextLine().split(" ");
        while (!commandArr[0].equals("End")){

            String carModel = commandArr[1];
            double kilometers = Double.parseDouble(commandArr[2]);

            Car car = map.get(carModel);

            car.canReach(carModel,kilometers);

            commandArr = scanner.nextLine().split(" ");
        }


        for (Map.Entry<String, Car> entry : map.entrySet()) {
            Car car = entry.getValue();

            System.out.printf("%s %.2f %.0f%n",car.getModel(),car.getFuel(),Math.abs(car.getDistanceTraveled()));
        }


    }
}
