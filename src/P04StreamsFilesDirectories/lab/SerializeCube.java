package P04StreamsFilesDirectories.lab;

import java.io.*;
import java.util.Scanner;

public class SerializeCube {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Cube cube = new Cube("blue",15.3,12.4,3);
        String path = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories\\myCube.ser";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(cube);
        objectOutputStream.close();

    }
}
