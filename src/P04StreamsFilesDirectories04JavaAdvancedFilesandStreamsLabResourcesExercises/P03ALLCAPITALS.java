package P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises;

import java.io.*;
import java.util.Locale;

public class P03ALLCAPITALS {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOUT = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";

        File fileIn = new File(pathIn);
        File fileOut = new File(pathOUT);
        FileReader fileReader = new FileReader(pathIn);
        FileWriter fileWriter = new FileWriter(pathOUT);

        BufferedReader br = new BufferedReader(fileReader);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        String lineIn = br.readLine();

        while (lineIn!=null){

            String allCapitals = lineIn.toUpperCase(Locale.ROOT);
            bw.write(allCapitals);
            bw.newLine();
            lineIn = br.readLine();
        }
        bw.close();
    }
}
