package homework_05_12_2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    public void turns() {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] expected1 = {
                {1, 4},
                {2, 5},
                {3, 6}
        };
        int[][] result1 = Task2.turns(matrix1);
        assertArrayEquals(expected1, result1);
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected2 = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        int[][] result2 = Task2.turns(matrix2);
        assertArrayEquals(expected2, result2);
    }
}