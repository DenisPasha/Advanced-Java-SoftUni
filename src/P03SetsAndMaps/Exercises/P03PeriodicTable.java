package P03SetsAndMaps.Exercises;

import java.sql.Array;
import java.util.*;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Set<String> set=new TreeSet<>();

        for (int i = 1; i <= n ; i++) {
            String[] chemElements = scanner.nextLine().split(" ");
            set.addAll(Arrays.asList(chemElements));
        }

        set.forEach(element -> System.out.printf("%s ",element));

    }
}
