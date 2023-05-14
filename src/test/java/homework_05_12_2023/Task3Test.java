package homework_05_12_2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    @Test
    void transpose() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        int[][] result = Task3.transpose(matrix);
        assertArrayEquals(expected, result);
    }
}