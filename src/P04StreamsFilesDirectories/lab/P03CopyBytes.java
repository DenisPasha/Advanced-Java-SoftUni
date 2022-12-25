package P04StreamsFilesDirectories.lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class P03CopyBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\denis\\IdeaProjects\\Advanced-Java-SoftUni\\src\\P04StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt";

        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(outputPath);

        int oneByte = fileInputStream.read();

        while (oneByte >= 0){

            if (oneByte == 32 || oneByte == 10){
                fileOutputStream.write(oneByte);
            }else {
                String digits = String.valueOf(oneByte);

                for (int i = 0; i < digits.length(); i++) {
                    fileOutputStream.write(digits.charAt(i));

                }
            }


            oneByte=fileInputStream.read();
        }


    }
}
