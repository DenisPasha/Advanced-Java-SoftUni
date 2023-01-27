package FilesStreamsandDirectoriesRevision.lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P06SortLines {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\sortedInput.txt";

        List<String> lines = Files.readAllLines(Path.of(path));
        Collections.sort(lines);
        System.out.println();


    }
}
