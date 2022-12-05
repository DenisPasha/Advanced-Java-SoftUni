package P03SetsAndMaps.Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character,Integer>map=new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            map.putIfAbsent(ch,0);
            map.put(ch,map.get(ch)+1) ;
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            //S: 1 time/s
            System.out.printf("%c: %d time/s%n",entry.getKey(),entry.getValue());
        }

    }
}
