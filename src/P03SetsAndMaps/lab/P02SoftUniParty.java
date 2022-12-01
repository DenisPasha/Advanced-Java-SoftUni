package P03SetsAndMaps.lab;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guests=scanner.nextLine();
        Set<String>expectedGuestSet=new TreeSet<>();

        while (!guests.equals("PARTY")){
            expectedGuestSet.add(guests);
            guests=scanner.nextLine();
        }

        String guestComing=scanner.nextLine();

        while (!guestComing.equals("END")){

            if (expectedGuestSet.contains(guestComing)){
                expectedGuestSet.remove(guestComing);
            }
            guestComing=scanner.nextLine();

        }

        System.out.println(expectedGuestSet.size());
        expectedGuestSet.forEach(System.out::println);

    }
}
