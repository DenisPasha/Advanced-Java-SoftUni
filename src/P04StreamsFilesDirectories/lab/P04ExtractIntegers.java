package P04StreamsFilesDirectories.lab;

import java.io.*;
import java.util.Scanner;

public class P04ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";

        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(output);

        Scanner scanner = new Scanner(fileInputStream);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                printWriter.println(scanner.nextInt());
            }
            scanner.next();
        }
        printWriter.close();


    }
}
