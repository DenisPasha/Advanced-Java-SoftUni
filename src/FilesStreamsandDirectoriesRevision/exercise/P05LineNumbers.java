package FilesStreamsandDirectoriesRevision.exercise;

import java.io.*;

public class P05LineNumbers {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String pathOut = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";


        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathIn));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathOut));

        String line = bufferedReader.readLine();

        int lineCount = 1;

        while (line != null){

            bufferedWriter.write(lineCount+". "+line);
            bufferedWriter.newLine();
            lineCount++;

            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

    }
}
