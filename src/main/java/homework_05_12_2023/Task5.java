package homework_05_12_2023;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task5 {
    public static void main(String[] args) {
        task5();
    }

    public static void task5() {
        String filename = "src/main/java/homework_05_12_2023/file_example.txt";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
