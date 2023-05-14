package homework_05_12_2023;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task8 {
    public static void main(String[] args) {
        fileReaderAndException();
    }

    public static void fileReaderAndException() {
        String fileName = "src/main/java/homework_05_12_2023/file_example.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                int wordCount = countWords(line);
                System.out.println("Line " + lineNumber + ": " + wordCount + " words");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int countWords(String line) {
        if (line == null || line.isEmpty()) {
            return 0;
        }
        String[] words = line.split("\\s+");
        return words.length;
    }
}
