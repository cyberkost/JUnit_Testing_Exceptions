package homework_module_5.JUnit_tasks;

public class Task3 {
    public static void main(String[] args) {
        inputData();
    }

    public static void inputData() {
        String input = "hello";
        String result = substring(input, 2, 4);
        System.out.println(result);
    }

    public static String substring(String input, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > input.length() || startIndex >= endIndex) {
            throw new IllegalArgumentException();
        }
        StringBuilder builder = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            builder.append(input.charAt(i));
        }
        return builder.toString();
    }
}
