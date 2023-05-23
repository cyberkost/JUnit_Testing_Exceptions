package homework_05_16_2023;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class FileManagerTest {
    @Test
    public void testReadFile() {
        ReaderFile readerFile = Mockito.mock(ReaderFile.class);
        FileManager fileManager = new FileManager(readerFile);
        String filePath = "path/to/file.txt";
        String expectedContent = "File";
        when(readerFile.readFile(filePath)).thenReturn(expectedContent);
        String result = fileManager.readFile(filePath);
        verify(readerFile).readFile(filePath);
        assertEquals(expectedContent, result);
    }
}