package P04StreamsFilesDirectories.lab;

import java.io.File;
import java.util.Scanner;

public class P07ListFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File file = new File("C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        if (file.exists()){
            if (file.isDirectory()){
                File[] filesArr = file.listFiles();
                for (int i = 0; i < filesArr.length; i++) {
                    if (!filesArr[i].isDirectory()){
                        System.out.printf("%s: [%s]%n",filesArr[i].getName(),filesArr[i].length());
                    }
                }
            }
        }
    }
}
