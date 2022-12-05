package P03SetsAndMaps.Exercises;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String,String> map=new LinkedHashMap<>();

        while (!input.equals("search")){
            String[] inputArr = input.split("-");
            String name = inputArr[0];
            String phone = inputArr[1];

            map.putIfAbsent(name,"");
            map.put(name,phone);

            input=scanner.nextLine();
        }

        String search = scanner.nextLine();
        while (!search.equals("stop")){
            if (map.containsKey(search)){
                System.out.printf("%s -> %s%n",search,map.get(search));
            }else {
                System.out.printf("Contact %s does not exist.%n",search);
            }
            search=scanner.nextLine();
        }




    }
}
