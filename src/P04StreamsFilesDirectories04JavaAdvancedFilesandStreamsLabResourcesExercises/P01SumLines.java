package P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class P01SumLines {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader br = Files.newBufferedReader(Path.of(path));
        String line = br.readLine();
            while (!line.equals(null)) {

                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    int symbol = line.charAt(i);
                    sum+=symbol;

                }
                System.out.println(sum);

               line = br.readLine();
            }
    }
}
