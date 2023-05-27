package homework_module_5.Optional;

import java.util.Optional;

public class Task4 {
    public static void main(String[] args) {
        inputString();
    }

    private static void inputString() {
        String value = "I make homework";
        if (calculateLength(value).isPresent()) {
            int length = calculateLength(value).get();
            System.out.println("Length: " + length);
        } else {
            System.out.println("String is null!");
        }
    }

    private static Optional<Integer> calculateLength(String value) {
        if (value == null) {
            return Optional.empty();
        }
        int length = value.length();
        return Optional.of(length);
    }
}
