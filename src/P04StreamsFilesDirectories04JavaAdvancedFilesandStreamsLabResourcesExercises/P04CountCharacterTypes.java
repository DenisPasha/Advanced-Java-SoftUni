package P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class P04CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOut = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories04JavaAdvancedFilesandStreamsLabResourcesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        File fileIn = new File(pathIn);
        File fileOut = new File(pathOut);
        FileReader fileReader = new FileReader(fileIn);
        FileWriter fileWriter = new FileWriter(fileOut);
        BufferedReader br = new BufferedReader(fileReader);
        BufferedWriter bw = new BufferedWriter(fileWriter);

        String line = br.readLine();

        Set<Character> vowelsSet = new HashSet<>();
        Set<Character> punctuationSet = new HashSet<>();
        vowelsSet.add('a');
        vowelsSet.add('e');
        vowelsSet.add('i');
        vowelsSet.add('o');
        vowelsSet.add('u');

        punctuationSet.add('!');
        punctuationSet.add('.');
        punctuationSet.add(',');
        punctuationSet.add('?');

        int vowelsCount=0;
        int punctuationsCount=0;
        int othersCount=0;

        while (line!=null){

            for (int i = 0; i < line.length(); i++) {
                char currentChar = line.charAt(i);
                if (vowelsSet.contains(currentChar)){
                    vowelsCount++;
                } else if (punctuationSet.contains(currentChar)) {
                    punctuationsCount++;
                }else if (currentChar!=32){
                    othersCount++;
                }

            }

            line=br.readLine();
        }

        String vowels = String.valueOf(vowelsCount);
        String others = String.valueOf(othersCount);
        String punctuations = String.valueOf(punctuationsCount);

        bw.write("Vowels: "+vowels);
        bw.newLine();
        bw.write("Other symbols: "+others);
        bw.newLine();
        bw.write("Punctuation: "+punctuations);
        bw.newLine();
        bw.close();

        System.out.println(vowelsCount);
        System.out.println(othersCount);
        System.out.println(punctuationsCount);
    }
}
