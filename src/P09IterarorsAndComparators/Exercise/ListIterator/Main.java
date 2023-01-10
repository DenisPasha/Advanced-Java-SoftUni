package P09IterarorsAndComparators.Exercise.ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<ListiIterator> listiIteratorList = new ArrayList<>();
        while (!command.contains("END")){

            if (command.contains("Create")){
                List<String> inputList = Arrays.stream(command.split(" ")).skip(1).collect(Collectors.toList());
                ListiIterator listiIterator = new ListiIterator(inputList);
                listiIteratorList.add(listiIterator);
                
            } else if (command.equals("Move")) {
                System.out.println(listiIteratorList.get(0).move());
            } else if (command.equals("Print")) {
                listiIteratorList.get(0).print();
            } else if (command.equals("HasNext")) {
                System.out.println(listiIteratorList.get(0).hasNext());
            } else if (command.equals("PrintAll")) {
                listiIteratorList.get(0).printAll();
            }
            command = scanner.nextLine();
        }


    }
}
