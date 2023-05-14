package homework_05_12_2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    void IsMono() {
        int[] array1 = {1, 1, 2, 3, 4, 6, 8, 8, 9};
        int[] array2 = {80, 75, 75, 75, 75, 75, 74, 73, 5, 5, 5};
        int[] array3 = {10, 10, 11, 11, 12, 12, 13, 12};

        assertTrue(Task1.isMono(array1));
        assertTrue(Task1.isMono(array2));
        assertFalse(Task1.isMono(array3));
    }

    @Test
    void testIsMonoWithNullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            Task1.isMono(null);
        });
    }
}