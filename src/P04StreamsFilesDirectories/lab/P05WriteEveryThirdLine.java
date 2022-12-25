package P04StreamsFilesDirectories.lab;

import java.io.*;
import java.util.Scanner;

public class P05WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";

        FileReader fileReader = new FileReader(path);
        FileWriter fileWriter = new FileWriter(output);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        PrintWriter printWriter = new PrintWriter(output);

      String line = bufferedReader.readLine();
      int counter = 0;
      while (line!=null){
          counter++;

          if (counter % 3==0){
              printWriter.println(line);
          }
          line = bufferedReader.readLine();
      }
      printWriter.close();
    }
}
