package homework_05_12_2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void findSomeNumber() {
        int[] arr = {1, 12, -10, 25, 31, 49, 15, 4, 53, -20};
        int k = 57;
        int[] expected = {1, 12, -10, 25, 31, 49, 15, 4, 53, -20};
        assertArrayEquals(expected, Task4.findSomeNumber(arr, k));
    }
}