package P09IterarorsAndComparators.Exercise.ListyIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        List<String> inputList = Arrays.stream(command.split(" ")).skip(1).collect(Collectors.toList());
        ListyIterator listyIterator  = new ListyIterator(inputList);

        String command2 = scanner.nextLine();
        while (!command2.equals("END")){

            if (command2.equals("HasNext")){
                System.out.println(listyIterator.hasNext());
            } else if (command2.equals("Print")) {
                listyIterator.print();
            } else if (command2.equals("Move")) {
                System.out.println(listyIterator.Move());
            } else if (command2.equals("PrintAll")) {
                listyIterator.printAll();
            }
            command2 = scanner.nextLine();
        }
    }
}
