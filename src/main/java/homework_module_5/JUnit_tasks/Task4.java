package homework_module_5.JUnit_tasks;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        inputListOfNumbers();
    }

    public static void inputListOfNumbers() {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        double average = getAverage(numbers);
        System.out.println("Average: " + average);
    }

    public static double getAverage(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}
