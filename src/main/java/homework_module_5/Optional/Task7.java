package homework_module_5.Optional;

import java.util.Optional;

public class Task7 {
    public static void main(String[] args) {
        valueAndException();
    }

    private static void valueAndException() {
        Double value = 5.0;
        try {
            System.out.println("Square root value: " + calcSquareRoot(value));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value!");
        }
    }

    private static double calcSquareRoot(Double value) throws IllegalArgumentException {
        return Optional.ofNullable(value)
                .filter(v -> v > 0)
                .map(Math::sqrt)
                .orElseThrow(IllegalArgumentException::new);
    }
}
