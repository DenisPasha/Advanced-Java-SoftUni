package P03SetsAndMaps.lab;

import java.util.*;

public class P04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] inputArr= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Map<Double,Integer> map = new LinkedHashMap<>();

        for (double currentNum : inputArr) {
            if (map.containsKey(currentNum)) {
                map.put(currentNum, map.get(currentNum) + 1);
            }
            map.putIfAbsent(currentNum, 1);

        }

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
