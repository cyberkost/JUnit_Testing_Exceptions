package homework_module_5.JUnit_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void toUpperCaseTest() {
        String input = "hello";
        String expected = Task1.toUpperCase(input);
        assertEquals("HELLO", expected);
    }
}