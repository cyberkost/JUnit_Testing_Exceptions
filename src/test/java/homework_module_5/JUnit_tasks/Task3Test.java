package homework_module_5.JUnit_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void testSubstring() {
        String input = "hello";
        String expectedOutput = "ll";
        String actualOutput = Task3.substring(input, 2, 4);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testInvalidIndexes() {
        String input = "hello";
        assertThrows(IllegalArgumentException.class, () -> {
            Task3.substring(input, -1, 4);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Task3.substring(input, 2, 1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Task3.substring(input, 2, 10);
        });
    }
}