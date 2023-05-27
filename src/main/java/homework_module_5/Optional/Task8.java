package homework_module_5.Optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Task8 {
    public static void main(String[] args) {
        inputHashMap();
    }

    private static void inputHashMap() {
        Map<String, Integer> taskMap = new HashMap<>();
        taskMap.put("A", 10);
        taskMap.put("B", 20);
        taskMap.put("C", 30);
        if (findMaxValue(taskMap).isPresent()) {
            System.out.println("Max value: " + findMaxValue(taskMap).get());
        } else {
            System.out.println("Hashmap is empty!");
        }
    }

    private static Optional<Integer> findMaxValue(Map<String, Integer> taskMap) {
        return taskMap.values().stream()
                .max(Integer::compareTo);
    }
}
