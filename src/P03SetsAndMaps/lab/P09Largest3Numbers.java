package P03SetsAndMaps.lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>numList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        Collections.sort(numList,Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            if (numList.size()>i){
                int currentNum = numList.get(i);

                System.out.print(currentNum+" ");
            }

        }
    }
}
