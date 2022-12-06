package P03SetsAndMaps.Exercises;

import java.util.*;

public class P08UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //IP=192.23.30.40 message='Hello&derps.' user=destroyer

        String input = scanner.nextLine();
        Map<String,Map<String , Integer>> map = new TreeMap<>();

        while (!input.equals("end")){

            String ipText = input.split(" ")[0];
            String ip = ipText.split("=")[1];

            String userText = input.split(" ")[2];
            String user = userText.split("=")[1];

            map.putIfAbsent(user,new LinkedHashMap<>());
            map.get(user).putIfAbsent(ip,0);

            Map<String,Integer>secondaryMap = map.get(user);

            if (secondaryMap.containsKey(ip)){
              secondaryMap.put(ip,secondaryMap.get(ip)+1);
            }
            input=scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Integer>> entry : map.entrySet()) {
            System.out.printf("%s: %n",entry.getKey());

            Map<String , Integer> secondaryMap = entry.getValue();
            int size = secondaryMap.size()-1;
            int counter = 0;

            for (Map.Entry<String, Integer> integerEntry : secondaryMap.entrySet()) {

                if (counter == size){
                    break;
                }

                counter++;
                System.out.printf("%s => %d, ",integerEntry.getKey(),integerEntry.getValue());
            }

            counter=0;


            for (Map.Entry<String, Integer> integerEntry : secondaryMap.entrySet()) {

                counter++;
                if (counter == size+1){
                    System.out.printf("%s => %d.%n",integerEntry.getKey(),integerEntry.getValue());
                }

            }

        }


    }
}
