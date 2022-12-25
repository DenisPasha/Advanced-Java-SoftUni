package P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises;

import java.io.*;
import java.util.Scanner;

public class P02SumBytes {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        File file = new File(pathIn);
        FileReader fileReader = new FileReader(file);

        BufferedReader br = new BufferedReader(fileReader);

        String line = br.readLine();
        long sum = 0;
        while (line != null){

            for (int i = 0; i < line.length(); i++) {
                int currentNum = line.charAt(i);
                sum+=currentNum;
            }


            line = br.readLine();
        }
        System.out.println(sum);

    }
}
