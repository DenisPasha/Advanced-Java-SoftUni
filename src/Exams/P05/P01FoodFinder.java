package Exams.P05;

import java.util.*;

public class P01FoodFinder {

    private final static String PEAR = "pear";
    private final static String FLOUR = "flour";
    private final static String PORK = "pork";
    private final static String OLIVE = "olive";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String , String > map = new LinkedHashMap<>();
        map.put("pear","");
        map.put("flour","");
        map.put("pork","");
        map.put("olive","");

        String[] vowelsInput = scanner.nextLine().split(" ");
        String[] consonantInput = scanner.nextLine().split(" ");

        ArrayDeque<String> vowelsQueue = new ArrayDeque<>();
        ArrayDeque<String> consonantStack  = new ArrayDeque<>();

        for (int i = 0; i < consonantInput.length; i++) {
            consonantStack.push(consonantInput[i]);
        }

        for (int i = 0; i < vowelsInput.length; i++) {
            vowelsQueue.offer(vowelsInput[i]);
        }

        while (!consonantStack.isEmpty()){

            String currentConsonant = consonantStack.pop();
            String currentVowel = vowelsQueue.poll();
            vowelsQueue.offer(currentVowel);

            if (PEAR.contains(currentConsonant)){
                String pear = map.get("pear");
                if (!pear.contains(currentConsonant)){
                    pear = pear + currentConsonant;
                }
                map.put("pear",pear);
            }
            if (PEAR.contains(currentVowel)){
                String pear = map.get("pear");

                if (!pear.contains(currentVowel)){
                    pear = pear + currentVowel;
                }
                map.put("pear",pear);
            }


            if (PORK.contains(currentConsonant)){

                String pork = map.get("pork") ;
                if (!pork.contains(currentConsonant)){
                    pork = pork + currentConsonant;
                }
                map.put("pork",pork);
            }
            if (PORK.contains(currentVowel)){

                String pork = map.get("pork");
                if (!pork.contains(currentVowel)){
                    pork = pork + currentVowel;
                }
                map.put("pork",pork);
            }


            if (OLIVE.contains(currentConsonant)){
                String olive = map.get("olive") ;
                if (!olive.contains(currentConsonant)){
                    olive = olive + currentConsonant;
                }
                map.put("olive",olive);
            }
            if (OLIVE.contains(currentVowel)){
                String olive = map.get("olive") ;
                if (!olive.contains(currentVowel)){
                    olive = olive + currentVowel;
                }
                map.put("olive",olive);
            }


            if (FLOUR.contains(currentConsonant)){
                String flour = map.get("flour") ;
                if (!flour.contains(currentConsonant)){
                    flour = flour + currentConsonant;
                }
                map.put("flour",flour);
            }
            if (FLOUR.contains(currentVowel)){
                String flour = map.get("flour") ;
                if (!flour.contains(currentVowel)){
                    flour = flour + currentVowel;
                }
                map.put("flour",flour);
            }

        }


        List<String> words = new ArrayList<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().length() == entry.getKey().length()){
                words.add(entry.getKey());
            }
        }
        System.out.printf("Words found: %d%n",words.size());
        for (String word : words) {
            System.out.println(word);
        }


    }
}
