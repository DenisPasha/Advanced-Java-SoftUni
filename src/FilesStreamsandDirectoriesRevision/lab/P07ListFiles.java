package FilesStreamsandDirectoriesRevision.lab;

import java.io.File;

public class P07ListFiles {
    public static void main(String[] args) {

        String path = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File file = new File(path);
        File[] files = file.listFiles();

        for (File currentFile : files) {

            System.out.printf("%s: %d%n",currentFile.getName(),currentFile.length());
        }


    }
}
