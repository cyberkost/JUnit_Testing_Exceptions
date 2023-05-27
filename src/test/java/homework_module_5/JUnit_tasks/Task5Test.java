package homework_module_5.JUnit_tasks;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {
    @Test
    void testGetMax() {
        List<Integer> numbers = List.of(1, 5, 3, 7, 2);
        int expectedMax = 7;
        int actualMax = Task5.getMax(numbers);
        assertEquals(expectedMax, actualMax);
    }

    @Test
    void testEmptyList() {
        List<Integer> emptyList = List.of();
        assertThrows(IllegalArgumentException.class, () -> {
            Task5.getMax(emptyList);
        });
    }

    @Test
    void testNullList() {
        assertThrows(IllegalArgumentException.class, () -> {
            Task5.getMax(null);
        });
    }
}