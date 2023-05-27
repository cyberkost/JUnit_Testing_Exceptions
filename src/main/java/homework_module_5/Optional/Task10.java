package homework_module_5.Optional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Task10 {
    public static void main(String[] args) {
        checkAndFound();
    }

    private static void checkAndFound() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> foundNumber = findObject(numbers, num -> num % 2 == 0);
        if (foundNumber.isPresent()) {
            System.out.println("Found number: " + foundNumber.get());
        } else {
            System.out.println("No number found!");
        }
    }

    private static <T> Optional<T> findObject(List<T> list, Predicate<T> condition) {
        for (T obj : list) {
            if (condition.test(obj)) {
                return Optional.of(obj);
            }
        }
        return Optional.empty();
    }
}
