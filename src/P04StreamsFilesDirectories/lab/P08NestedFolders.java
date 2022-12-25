package P04StreamsFilesDirectories.lab;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Scanner;

public class P08NestedFolders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File root = new File("C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\Streams-and-Files");
        ArrayDeque<File> queue = new ArrayDeque<>();

        queue.offer(root);

        int count = 0;

        while (!queue.isEmpty()){

         File current = queue.poll();

            File[] nestedFiles = current.listFiles();
            for (int i = 0; i < nestedFiles.length; i++) {
                File currentNestedFile = nestedFiles[i];
               if (currentNestedFile.isDirectory()){
                   queue.offer(currentNestedFile);
                   count++;
                   System.out.println(current.getName());
               }
                System.out.println(count+" folders");
            }

        }
    }
}
