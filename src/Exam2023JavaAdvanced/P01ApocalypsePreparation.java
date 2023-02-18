package Exam2023JavaAdvanced;

import java.util.*;

public class P01ApocalypsePreparation {
    private final static int PATCH = 30;
    private final static int BANDAGE = 40;
    private final static int MEDKIT = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] textilesInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] medicamentInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> medicamentStack = new ArrayDeque<>();
        ArrayDeque<Integer> textilesQueue = new ArrayDeque<>();

        for (int i = 0; i < medicamentInput.length; i++) {
            medicamentStack.push(medicamentInput[i]);
        }
        for (int i = 0; i < textilesInput.length; i++) {
            textilesQueue.offer(textilesInput[i]);
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("Patch", 0);
        map.put("Bandage", 0);
        map.put("MedKit", 0);

        while (!medicamentStack.isEmpty() && !textilesQueue.isEmpty()) {

            int currentMedicament = medicamentStack.peek();
            int currentTextile = textilesQueue.peek();

            int sum = currentTextile + currentMedicament;

            if (sum == PATCH) {
                medicamentStack.pop();
                textilesQueue.poll();
                Integer patch = map.get("Patch");
                patch = patch + 1;
                map.put("Patch", patch);
            } else if (sum == BANDAGE) {
                medicamentStack.pop();
                textilesQueue.poll();
                Integer bandage = map.get("Bandage");
                bandage = bandage + 1;
                map.put("Bandage", bandage);
            } else if (sum == MEDKIT) {
                medicamentStack.pop();
                textilesQueue.poll();
                Integer medKit = map.get("MedKit");
                medKit = medKit + 1;
                map.put("MedKit", medKit);
            } else if (sum > MEDKIT) {
                medicamentStack.pop();
                textilesQueue.poll();
                Integer medKit = map.get("MedKit");
                medKit = medKit + 1;
                map.put("MedKit", medKit);

                sum = sum - MEDKIT;
                Integer nextMedication = medicamentStack.pop();
                nextMedication = nextMedication + sum;
                medicamentStack.push(nextMedication);
            }else {
                textilesQueue.poll();
                currentMedicament = medicamentStack.pop() + 10;
                medicamentStack.push(currentMedicament);
            }
        }

        if (textilesQueue.isEmpty() && medicamentStack.isEmpty()){
            System.out.println("Textiles and medicaments are both empty.");
        } else if (textilesQueue.isEmpty()) {
            System.out.println("Textiles are empty.");
        } else if (medicamentStack.isEmpty()) {
            System.out.println("Medicaments are empty.");
        }
        Map<String , Integer> reverseSortedMap = new LinkedHashMap<>();


        map.entrySet().stream()
                .sorted(Map.Entry.<String , Integer> comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .filter(stringIntegerEntry -> stringIntegerEntry.getValue()!=0)
                .forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry.getKey() + " - "+ stringIntegerEntry.getValue()));



//        map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
//
//        for (Map.Entry<String, Integer> entry : reverseSortedMap.entrySet()) {
//            if (entry.getValue() > 0){
//                System.out.printf("%s - %d%n",entry.getKey(),entry.getValue());
//            }
//        }

        if(!textilesQueue.isEmpty()){
            System.out.print("Textiles left: ");
            while(!textilesQueue.isEmpty()){
                if (textilesQueue.size() > 1){
                    System.out.print(textilesQueue.poll() + ", ");
                } else {
                    System.out.print(textilesQueue.poll());
                }

            }
        }

        if(!medicamentStack.isEmpty()){
            System.out.print("Medicaments left: ");
            while(!medicamentStack.isEmpty()){
                if (medicamentStack.size() > 1){
                    System.out.print(medicamentStack.pop() + ", ");
                } else {
                    System.out.print(medicamentStack.pop());
                }
            }
        }


    }
}
