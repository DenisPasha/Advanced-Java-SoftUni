package Exams.P03;

import java.util.*;

public class P01ItsChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] milkValues = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double[] cacaoValues = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        ArrayDeque<Double> cacaoStack = new ArrayDeque<>();
        ArrayDeque<Double>  milkQueue= new ArrayDeque<>();


        Map<String , Integer> chocolateMap = new TreeMap<>();
        chocolateMap.put("Milk Chocolate",0);
        chocolateMap.put("Dark Chocolate",0);
        chocolateMap.put("Baking Chocolate",0);


        Arrays.stream(milkValues).forEachOrdered(milkQueue::offer);
        Arrays.stream(cacaoValues).boxed().forEachOrdered(cacaoStack::push);


        while (cacaoStack.size() > 0 && milkQueue.size() > 0){

            double currentCacao = cacaoStack.peek();
            double currentMilk= milkQueue.peek();

           double cacaoPercantage = (currentCacao / (currentMilk + currentCacao))*100;

           if (cacaoPercantage == 30){
               if (!chocolateMap.containsKey("Milk Chocolate")){
                   chocolateMap.put("Milk Chocolate",0);
                  int milkChocolatesCount = chocolateMap.get("Milk Chocolate");
                  chocolateMap.put("Milk Chocolate",milkChocolatesCount+1);
               }else {
                   int milkChocolatesCount = chocolateMap.get("Milk Chocolate");
                   chocolateMap.put("Milk Chocolate",milkChocolatesCount+1);
               }
               cacaoStack.pop();
               milkQueue.poll();
           } else if (cacaoPercantage == 50) {
               if (!chocolateMap.containsKey("Dark Chocolate")){
                   chocolateMap.put("Dark Chocolate",0);
                   int milkChocolatesCount = chocolateMap.get("Dark Chocolate");
                   chocolateMap.put("Dark Chocolate",milkChocolatesCount+1);
               }else {
                   int milkChocolatesCount = chocolateMap.get("Dark Chocolate");
                   chocolateMap.put("Dark Chocolate",milkChocolatesCount+1);
               }
               cacaoStack.pop();
               milkQueue.poll();
           } else if (cacaoPercantage == 100) {
               if (!chocolateMap.containsKey("Baking Chocolate")){
                   chocolateMap.put("Baking Chocolate",0);
                   int milkChocolatesCount = chocolateMap.get("Baking Chocolate");
                   chocolateMap.put("Baking Chocolate",milkChocolatesCount+1);
               }else {
                   int milkChocolatesCount = chocolateMap.get("Baking Chocolate");
                   chocolateMap.put("Baking Chocolate",milkChocolatesCount+1);
               }
               cacaoStack.pop();
               milkQueue.poll();
           }else {
               cacaoStack.pop();
               double tempMilk = milkQueue.poll() + 10;
               milkQueue.offer(tempMilk);
           }

        }
        int milkChok = chocolateMap.get("Milk Chocolate");
        int darkChok = chocolateMap.get("Dark Chocolate");
        int bakeChok = chocolateMap.get("Baking Chocolate");

        if (milkChok > 0 && darkChok > 0 && bakeChok > 0){

            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
            System.out.printf("# Baking Chocolate --> %d\n" +
                    "# Dark Chocolate --> %d\n" +
                    "# Milk Chocolate --> %d\n",bakeChok,darkChok,milkChok);
        }else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
            for (Map.Entry<String, Integer> entry : chocolateMap.entrySet()) {
                if (entry.getValue()>0){
                    System.out.printf("# %s --> %d%n",entry.getKey(),entry.getValue());
                }
            }


        }
    }
}
