package homework_module_5.JUnit_tasks;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    @Test
    void testGetAverage() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        double expectedAverage = 3.0;
        double actualAverage = Task4.getAverage(numbers);
        assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    @Test
    void testEmptyList() {
        List<Integer> emptyList = List.of();
        assertThrows(IllegalArgumentException.class, () -> {
            Task4.getAverage(emptyList);
        });
    }

    @Test
    void testNullList() {
        assertThrows(IllegalArgumentException.class, () -> {
            Task4.getAverage(null);
        });
    }
}