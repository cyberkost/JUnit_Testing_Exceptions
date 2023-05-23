package homework_05_16_2023;

import java.io.FileReader;

public class FileManager {
    private ReaderFile readerFile;

    public FileManager(ReaderFile readerFile) {
        this.readerFile = readerFile;
    }

    public String readFile(String filePath) {
        return readerFile.readFile(filePath);
    }
}

class ReaderFile {
    public String readFile(String filePath) {
        return null;
    }
}
