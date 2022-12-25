package P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class P06WordCount {
    public static void main(String[] args) throws IOException {

        String pathInWords = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        FileReader fileReader = new FileReader(pathInWords);
        BufferedReader br = new BufferedReader(fileReader);

        String words = br.readLine();
        String [] wordsArr = words.split(" ");
        Map<String , Integer> map= new LinkedHashMap<>();

        for (int i = 0; i < wordsArr.length; i++) {
            map.putIfAbsent(wordsArr[i],0);
        }


        String textIn = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        FileReader fr = new FileReader(textIn);
        BufferedReader br2 = new BufferedReader(fr);

        String line = br2.readLine();
        while (line!=null){

            String [] arr = line.split(" ");
            for (int i = 0; i < arr.length; i++) {
                String current = arr[i];
                if (map.containsKey(current)){
                    map.put(current,map.get(current)+1);
                }
            }

            line = br2.readLine();
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s - %d%n",entry.getKey(),entry.getValue());
        }


    }
}
