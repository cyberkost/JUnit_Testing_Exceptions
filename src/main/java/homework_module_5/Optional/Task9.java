package homework_module_5.Optional;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Task9 {
    public static void main(String[] args) {
        operationWithHashset();
    }

    private static void operationWithHashset() {
        Set<String> originalSet = new HashSet<>();
        originalSet.add("apple");
        originalSet.add("banana");
        originalSet.add("cherry");
        System.out.println("Transformed Set: " + transformSet(originalSet, String::toUpperCase));
    }

    public static <T, R> Set<R> transformSet(Set<T> set, Function<T, R> transformationFunction) {
        Set<R> transformedSet = new HashSet<>();
        for (T element : set) {
            transformedSet.add(transformationFunction.apply(element));
        }
        return transformedSet;
    }
}
