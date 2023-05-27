package homework_module_5.Optional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Task5 {
    public static void main(String[] args) {
        listOfStringsWithException();
    }

    private static void listOfStringsWithException() {
        List<String> strings = List.of("Hello", "World", "!");
        try {
            System.out.println("First string: " + findFirstString(strings));
        } catch (NoSuchElementException e) {
            System.out.println("List is empty!");
        }
    }

    private static String findFirstString(List<String> strings) throws NoSuchElementException {
        if (strings == null || strings.isEmpty()) {
            throw new NoSuchElementException();
        }
        return Optional.ofNullable(strings.get(0))
                .orElseThrow(NoSuchElementException::new);
    }
}
