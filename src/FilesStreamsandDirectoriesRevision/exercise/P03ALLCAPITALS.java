package FilesStreamsandDirectoriesRevision.exercise;

import java.io.*;
import java.util.Locale;

public class P03ALLCAPITALS {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOut = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathIn));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathOut));


        String line = bufferedReader.readLine();

        while (line != null){
            bufferedWriter.write(line.toUpperCase());
            bufferedWriter.newLine();
            line = bufferedReader.readLine();
        }
        bufferedWriter.close();
        bufferedReader.close();



    }
}
