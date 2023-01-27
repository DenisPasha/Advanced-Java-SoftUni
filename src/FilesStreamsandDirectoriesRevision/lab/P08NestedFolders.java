package FilesStreamsandDirectoriesRevision.lab;

import java.io.File;

public class P08NestedFolders {
    public static void main(String[] args) {

        String path = "C:\\Users\\denis\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File file = new File(path);
        if (file.isDirectory()){
            File returnedFile = extracted(file);
            while (returnedFile.isDirectory()){
                returnedFile = extracted(returnedFile);
            }
        }
    }

    private static File extracted(File currentFile) {
        File fileToReturn = null;
        File[] files1 = currentFile.listFiles();
        for ( File innerFile : files1) {
            if (innerFile.isDirectory()){
                System.out.println(innerFile.getName());
                 fileToReturn = innerFile;
            }
        }
        return fileToReturn;
    }
}
