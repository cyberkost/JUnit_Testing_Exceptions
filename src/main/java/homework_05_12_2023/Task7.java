package homework_05_12_2023;

import java.io.*;

public class Task7 {
    public static void mergeFiles(String[] inputFiles, String outputFile) throws IOException, FormatException {
        for (String inputFile : inputFiles) {
            if (!new File(inputFile).exists()) {
                throw new FileNotFoundException("File not found: " + inputFile);
            }
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String inputFile : inputFiles) {
                try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    throw new IOException("Error reading file: " + inputFile, e);
                } catch (Exception e) {
                    throw new FormatException("Error parsing data in file: " + inputFile, e);
                }
            }
        } catch (IOException e) {
            throw new IOException("Error writing to file: " + outputFile, e);
        }
    }

    public static void execution() {
        String[] inputFiles = {"src/main/java/homework_05_12_2023/file1.txt", "src/main/java/homework_05_12_2023/file2.txt", "src/main/java/homework_05_12_2023/file3.txt"};
        String outputFile = "src/main/java/homework_05_12_2023/merged.txt";

        try {
            Task7.mergeFiles(inputFiles, outputFile);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (FormatException e) {
            System.err.println("Format error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }

    public static class FormatException extends Exception {
        public FormatException(String message) {
            super(message);
        }

        public FormatException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void main(String[] args) {
        execution();
    }
}
