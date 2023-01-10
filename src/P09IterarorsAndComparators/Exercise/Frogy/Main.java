package P09IterarorsAndComparators.Exercise.Frogy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        Lake lake = new Lake(inputList);

        String command = scanner.nextLine();
        if (command.equals("END")){
            Iterator <Integer> evenIterator = lake.iterator();
            StringBuilder sb = new StringBuilder();

            while (evenIterator.hasNext()){
                sb.append(evenIterator.next()).append(", ");

            }
            sb.replace(sb.length()-2,sb.length()-1,"");
            System.out.println(sb.toString());
        }





    }
}
