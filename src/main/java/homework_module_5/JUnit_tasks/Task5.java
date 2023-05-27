package homework_module_5.JUnit_tasks;

import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        inputListOfNumbers();
    }

    public static void inputListOfNumbers() {
        List<Integer> numbers = List.of(1, 5, 3, 7, 2);
        int max = getMax(numbers);
        System.out.println("Max: " + max);
    }

    public static int getMax(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            if (currentNumber > max) {
                max = currentNumber;
            }
        }
        return max;
    }
}
