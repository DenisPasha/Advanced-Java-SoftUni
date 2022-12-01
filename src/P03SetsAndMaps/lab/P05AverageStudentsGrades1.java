package P03SetsAndMaps.lab;

import java.util.*;

public class P05AverageStudentsGrades1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> map=new TreeMap<>();


        for (int i = 1; i <=n ; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            String name=inputArr[0];
            double grade= Double.parseDouble(inputArr[1]);

            map.putIfAbsent(name,new ArrayList<>());
            map.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {

            double sum=0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                sum+=entry.getValue().get(i);
            }
            double average=sum/entry.getValue().size();
            map.get(entry.getKey()).add(average);
        }

        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {

            System.out.printf("%s -> ",entry.getKey());
            for (int i = 0; i < entry.getValue().size()-1; i++) {
                System.out.printf("%.2f ",entry.getValue().get(i));
            }
            System.out.printf("(avg: %.2f)",entry.getValue().get(entry.getValue().size()-1));
            System.out.println();
        }


    }
}
