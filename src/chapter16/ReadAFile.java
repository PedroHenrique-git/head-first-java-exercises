package chapter16;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadAFile {
    public static void main(String[] args) throws IOException {
        File myFile = new File("MyText.txt");
        FileReader fileReader = new FileReader(myFile);

        BufferedReader reader = new BufferedReader(fileReader);

        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();

        Files.lines(Path.of("MyText.txt")).forEach(System.out::println);
    }
}
