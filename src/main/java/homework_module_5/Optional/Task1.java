package homework_module_5.Optional;

import java.util.List;
import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        getListOfStrings();
    }

    private static void getListOfStrings() {
        List<String> strings = List.of("Hello", "World", "!");
        String result = getFirstString(strings).orElse("");
        System.out.println("First string: " + result);
    }

    private static Optional<String> getFirstString(List<String> strings) {
        if (strings.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(strings.get(0));
        }
    }
}
