package FilesStreamsandDirectoriesRevision.exercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P04CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String pathIn = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> lines = Files.readAllLines(Path.of(pathIn));

        int vowelsCount = 0;
        int punctuations = 0;
        int otherSymbols = 0;
        for (String currentLine : lines) {
            for (int i = 0; i < currentLine.length(); i++) {
                char currentChar = currentLine.charAt(i);

                switch (currentChar){
                    case 'a':
                    case 'e':
                    case 'o':
                    case 'u':
                    case 'i':
                        vowelsCount++;
                        break;
                    case ',':
                    case '.':
                    case '?':
                    case '!':
                        punctuations++;
                        break;
                    case ' ':
                        break;
                    default:otherSymbols++;
                }
            }
        }

        String pathOut = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        FileWriter fileWriter = new FileWriter(pathOut);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(String.format("Vowels: %d",vowelsCount));
        bufferedWriter.newLine();
        bufferedWriter.write(String.format("Other symbols: %d",otherSymbols));
        bufferedWriter.newLine();
        bufferedWriter.write(String.format("Punctuation:  %d",punctuations));
        bufferedWriter.newLine();
        bufferedWriter.close();

    }
}
