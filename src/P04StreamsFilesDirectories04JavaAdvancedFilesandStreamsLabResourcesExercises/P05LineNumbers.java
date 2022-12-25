package P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises;

import java.io.*;

public class P05LineNumbers {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String pathOut = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        FileReader fileReader = new FileReader(pathIn);
        BufferedReader br = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(pathOut);
        BufferedWriter bw = new BufferedWriter(fileWriter);


        String line = br.readLine();
        int counter = 0;

        while (line!=null){
            counter++;
            bw.write(counter+". "+line);
            bw.newLine();
            line= br.readLine();
        }
        bw.close();

    }
}
