package FilesStreamsandDirectoriesRevision.lab;

import java.io.*;

public class P04ExtractIntegers {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\NumbersExtracted.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathOut));

        String line = bufferedReader.readLine();

        while (line != null){

            for (int i = 0; i < line.length(); i++) {
                char currentChar = line.charAt(i);
                if (currentChar >= 48 && currentChar <= 57){
                    bufferedWriter.write(currentChar);
                }

            }
            bufferedWriter.newLine();
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
