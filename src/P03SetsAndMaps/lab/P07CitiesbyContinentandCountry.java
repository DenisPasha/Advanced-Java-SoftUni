package P03SetsAndMaps.lab;

import java.util.*;

public class P07CitiesbyContinentandCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        Map<String,Map<String, List<String>>>mainMap=new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            String input=scanner.nextLine();
            String[] inputArr=input.split(" ");
            String continent=inputArr[0];
            String country=inputArr[1];
            String city=inputArr[2];

            //filling main map with continent
            mainMap.putIfAbsent(continent,new LinkedHashMap<>());
            //filling secondary map with country
            mainMap.get(continent).putIfAbsent(country,new ArrayList<>());
            mainMap.get(continent).get(country).add(city);


        }

        for (Map.Entry<String, Map<String, List<String>>> entry : mainMap.entrySet()) {
            System.out.printf("%s:%n",entry.getKey());

            Map<String,List<String>>secondaryMap=entry.getValue();

            for (Map.Entry<String, List<String>> listEntry : secondaryMap.entrySet()) {
                System.out.printf("%s -> %s%n",listEntry.getKey(),String.join(", ",listEntry.getValue()));
            }

        }

    }
}
