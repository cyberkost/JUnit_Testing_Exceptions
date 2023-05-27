package homework_module_5.JUnit_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task2Test {

    @Test
    public void containsTestValidData() {
        String input = "Hello world";
        assertTrue(Task2.contains(input));
    }

    @Test
    public void containsTestInValidData() {
        String input = "Some text";
        assertFalse(Task2.contains(input));
    }

    @Test
    public void containsTestWithNull() {
        assertThrows(NullPointerException.class, () -> Task2.contains(null));
    }
}