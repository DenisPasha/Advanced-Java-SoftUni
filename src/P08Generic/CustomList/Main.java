package P08Generic.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList customList = new CustomList<>();


        String command = scanner.nextLine();
        while (!command.contains("END")){

            switch (command.split(" ")[0]){
                case "Add":
                    customList.add(command.split(" ")[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(command.split(" ")[1]));
                    break;
                case "Contains":
                    System.out.println(customList.contains(command.split(" ")[1]));
                    break;
                case "Swap":
                    int indexOne = Integer.parseInt(command.split(" ")[1]);
                    int indexTwo = Integer.parseInt(command.split(" ")[2]);
                    customList.swap(indexOne,indexTwo);
                     break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(command.split(" ")[1]));
                    break;
                case "Max":
                    System.out.println( customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    System.out.println(customList);
                    break;
                    case "Sort":
                    customList.sort();
                    break;

            }

            command = scanner.nextLine();
        }
    }
}
