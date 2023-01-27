package FilesStreamsandDirectoriesRevision.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class P06WordCount {
    public static void main(String[] args) throws IOException {
        String pathIn = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        String pathSecond = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathIn));
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(pathSecond));


        String line = bufferedReader.readLine();
        String[] words = line.split(" ");

        String lineSecond = bufferedReader1.readLine();
        String[] text = lineSecond.split(" ");
        List<String> wordsList = Arrays.stream(words).toList();

        Map<String,Integer>map = new LinkedHashMap<>();
        map.put(words[0],0 );
        map.put(words[1],0 );
        map.put(words[2],0 );

        for (int i = 0; i < text.length; i++) {

            String currentWord = text[i];
            if (wordsList.contains(currentWord)){

                map.put(currentWord,map.get(currentWord)+1);
            }
        }
        Collection<Integer> values = map.values();
        List<Integer> list = new ArrayList<>();

        for (Integer value : values) {
            list.add(value);
        }


        System.out.printf("of - %d\n" +
                "which - %d\n" +
                "The - %d\n",list.get(0),list.get(1),list.get(2));

    }
}
