package homework_module_5.Optional;

import java.util.List;
import java.util.Optional;

public class Task3 {
    public static void main(String[] args) {
        inputNumbers();
    }

    private static void inputNumbers() {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        if (sumOfNumbers(numbers).isPresent()) {
            int sum = sumOfNumbers(numbers).get();
            System.out.println("Sum: " + sum);
        } else {
            System.out.println("List is Empty");
        }
    }

    private static Optional<Integer> sumOfNumbers(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return Optional.empty();
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return Optional.of(sum);
    }
}
