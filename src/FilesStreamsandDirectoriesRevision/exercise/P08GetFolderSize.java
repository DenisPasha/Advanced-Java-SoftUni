package FilesStreamsandDirectoriesRevision.exercise;

import java.io.File;

public class P08GetFolderSize {
    public static void main(String[] args) {


        String path = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File file = new File(path);
        if (file.isDirectory()){
            long length = file.length();
            System.out.println(length);
        }




    }
}
