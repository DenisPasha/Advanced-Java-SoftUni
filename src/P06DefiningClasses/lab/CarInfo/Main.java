package P06DefiningClasses.lab.CarInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).toList();
            Car car = new Car();
            String brand = inputList.get(0);
            String model = inputList.get(1);
            int hp = Integer.parseInt(inputList.get(2));

            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(hp);

            carList.add(car);
        }

        for (int i = 0; i < carList.size(); i++) {
           Car car1 = carList.get(i);

           String brand = car1.getBrand();
           String model = car1.getModel();
           int hp = car1.getHorsePower();

            System.out.printf("The car is: %s %s - %d HP.%n",brand,model,hp);
        }


    }
}
