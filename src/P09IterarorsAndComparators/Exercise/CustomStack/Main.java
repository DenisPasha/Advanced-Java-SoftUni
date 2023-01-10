package P09IterarorsAndComparators.Exercise.CustomStack;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String command = scanner.nextLine();
        List<Stack> list = new ArrayList<>();
        while (!command.contains("END")){

            if (command.contains("Push")){
                List<Integer> inputList = Arrays.stream(command.split("[ ,]+")).skip(1).map(Integer::parseInt).collect(Collectors.toList());;

                ArrayDeque<Integer> currentStack = new ArrayDeque<>();
                for (int i = 0; i < inputList.size(); i++) {
                    currentStack.push(inputList.get(i));
                }
                Stack stack = new Stack(currentStack);
                list.add(stack);

            } else if (command.contains("Pop")) {
                Stack stack = list.get(0);
                stack.pop();
            }

            command = scanner.nextLine();
        }

        Stack stack = list.get(0);
//        stack.forEach();

        System.out.println();
        Iterator<Integer> assistant = stack.iterator();
            while (assistant.hasNext()){
                System.out.println(assistant.next());
            }


    }
}
