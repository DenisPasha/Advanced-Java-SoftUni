package FilesStreamsandDirectoriesRevision.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P01SumLines {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathIn));

        String line = bufferedReader.readLine();

        while (line != null){

            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                sum = sum + line.charAt(i);
            }
            System.out.println(sum);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();


    }
}
