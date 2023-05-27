package homework_module_5.Optional;

import java.util.Optional;

public class Task2 {
    public static void main(String[] args) {
        printValue();
    }

    private static void printValue() {
        Integer value = 10;
        doubleValue(value).ifPresent(integer -> System.out.println("Doubled value: " + integer));
    }

    private static Optional<Integer> doubleValue(Integer value) {
        if (value != null) {
            return Optional.of(value * 2);
        } else {
            return Optional.empty();
        }
    }
}
