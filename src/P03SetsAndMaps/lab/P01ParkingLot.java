package P03SetsAndMaps.lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        Set<String>set=new LinkedHashSet<>();

        while (!input.equals("END")){
            String[] inputArr=input.split(", ");

            if (inputArr[0].equals("IN")){
                set.add(inputArr[1]);
            }else {
                set.remove(inputArr[1]);
            }
            input=scanner.nextLine();
        }
        if (set.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            set.forEach(System.out::println);
        }

    }
}
