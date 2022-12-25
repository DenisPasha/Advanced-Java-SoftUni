package P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class P07MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        String  pathTwo = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
      //  String pathOne = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";

        String pathOne = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";

        String pathOut = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        FileReader fileReader1 = new FileReader(pathOne);
        FileReader fileReader2 = new FileReader(pathTwo);
        FileWriter fileWriter = new FileWriter(pathOut);

        BufferedReader bufferedReader = new BufferedReader(fileReader1);
        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
        BufferedWriter bw = new BufferedWriter(fileWriter);

        String line = bufferedReader.readLine();
        while (line!=null){
            bw.write(line);
            bw.newLine();
            line=bufferedReader.readLine();
        }
        String line2 = bufferedReader2.readLine();
        while (line2!=null){
            bw.write(line2);
            bw.newLine();
            line2 = bufferedReader2.readLine();
        }
        bw.close();


    }
}
