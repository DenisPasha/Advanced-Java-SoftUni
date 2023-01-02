package P06DefiningClasses.Exercises.SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Car> carMap =new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            String carModel = inputArr[0];
            int fuelAmount = Integer.parseInt(inputArr[1]);
            double costPerKilometer = Double.parseDouble(inputArr[2]);

            Car car = new Car(carModel,fuelAmount,costPerKilometer);
            carMap.put(carModel,car);

        }

        String command = scanner.nextLine();
        while (!command.contains("End")){

            String model = command.split(" ")[1];
            int amountOfKilometers = Integer.parseInt(command.split(" ")[2]);

            for (Map.Entry<String, Car> entry : carMap.entrySet()) {
                Car car = entry.getValue();
                if (car.getModel().equals(model)){
                    car.canMove(amountOfKilometers);
                }
            }


            command=scanner.nextLine();
        }

        //Model} {fuelAmount} {distanceTraveled

        for (Map.Entry<String, Car> entry : carMap.entrySet()) {
            Car car = entry.getValue();
            String carModel = car.getModel();
            double fuelAmount = car.getFuel();
            int distance = car.getDistanceTraveled();
            System.out.printf("%s %.2f %d%n",carModel,fuelAmount,distance);
        }


    }
}
