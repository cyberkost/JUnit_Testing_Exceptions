package homework_module_5.Optional;

import java.util.Optional;

public class Task6 {
    public static void main(String[] args) {
        inputValue();
    }

    private static void inputValue() {
        Integer value = 10;
        try {
            System.out.println("Doubled value: " + doubleInteger(value));
        } catch (IllegalArgumentException e) {
            System.out.println("Value is null");
        }
    }

    private static Integer doubleInteger(Integer value) throws IllegalArgumentException {
        return Optional.ofNullable(value)
                .map(v -> v * 2)
                .orElseThrow(IllegalArgumentException::new);
    }
}
