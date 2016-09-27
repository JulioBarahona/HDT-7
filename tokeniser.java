import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;

public class TextGenerator {
    //new array with unsorted numbers that will be tested
    int[] numbers;

    //generates file and makes the int array ready to be used
    public void fileGenerator() throws Exception {
        
		// Prints out arrays lenght
        System.out.println("ArrayLength = " + arrayLength);
		
        //files name
        Path outputPath = Paths.get("nombreArchivo.txt");

        //makes new reader object (file_location,writing_type)
        BufferedReader reader = Files.newBufferedReader(outputPath, Charset.defaultCharset());

        //reader object to read line
        String input = reader.readLine();

        //array called token, reades the file and makes new objects each " " (space line) it reads
        String[] tokens = input.split(" ");

        // new integer array called numbers, size of the token lenght
        numbers = new int[tokens.length];

        //parses each string into an int
        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }
    }
}
