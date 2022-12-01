package P03SetsAndMaps.lab;

import java.util.*;

public class P06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        Map<String, Map<String,Double>>mainMap=new TreeMap<>();

        while (!input.equals("Revision")){
            String[] inputArr=input.split(", ");
            String shop=inputArr[0];
            String product=inputArr[1];
            double price= Double.parseDouble(inputArr[2]);

            mainMap.putIfAbsent(shop,new LinkedHashMap<>());
            mainMap.get(shop).putIfAbsent(product,0.00);

            double priceOfItem=mainMap.get(shop).get(product);
            mainMap.get(shop).put(product,priceOfItem+price);

            input=scanner.nextLine();

        }

        for (Map.Entry<String, Map<String, Double>> entry : mainMap.entrySet()) {
            System.out.printf("%s->%n",entry.getKey());

          Map<String,Double>secondaryMap= entry.getValue();

            for (Map.Entry<String, Double> doubleEntry : secondaryMap.entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n",doubleEntry.getKey(),doubleEntry.getValue());
            }


        }

    }
}
