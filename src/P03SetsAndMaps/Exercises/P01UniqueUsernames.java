package P03SetsAndMaps.Exercises;

import java.util.*;

public class P01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> set=new LinkedHashSet<>();


        for (int i = 1; i <=n ; i++) {
            String name = scanner.nextLine();
            set.add(name);
        }
        List<String>textList= new ArrayList<>();
         set.forEach(element -> Collections.addAll(textList,element));

         textList.forEach(System.out::println);


    }
}
