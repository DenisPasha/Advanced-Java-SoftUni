package P06DefiningClasses.lab.Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        List<Constructors> constructorsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

            if (inputList.size()==1){
                Constructors constructors = new Constructors(inputList.get(0));
                constructorsList.add(constructors);
            }else {
                Constructors constructors = new Constructors(inputList.get(0));
                constructors.setBrand(inputList.get(0));
                constructors.setModel(inputList.get(1));
                constructors.setHorsePower(Integer.parseInt(inputList.get(2)));
                constructorsList.add(constructors);
            }


        }

        for (int i = 0; i < constructorsList.size(); i++) {
            Constructors constructors = constructorsList.get(i);

            String brand = constructors.getBrand();
            String model = constructors.getModel();
            int hp = constructors.getHorsePower();
            System.out.printf("The car is: %s %s - %d HP.%n",brand,model,hp);
        }

    }
}
