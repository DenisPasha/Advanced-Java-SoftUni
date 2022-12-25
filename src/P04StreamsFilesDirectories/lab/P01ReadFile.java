package P04StreamsFilesDirectories.lab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class P01ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        int oneByte = fileInputStream.read();

        while (oneByte >=0){
            System.out.printf("%s ",Integer.toBinaryString(oneByte));

            oneByte = fileInputStream.read();
        }

    }
}
