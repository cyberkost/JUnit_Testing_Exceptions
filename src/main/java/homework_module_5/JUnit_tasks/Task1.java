package homework_module_5.JUnit_tasks;

public class Task1 {
    public static void main(String[] args) {
        inputString();
    }

    public static void inputString() {
        String str = "hello";
        System.out.println(toUpperCase(str));
    }

    public static String toUpperCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            result.append(c);
        }
        return result.toString();
    }
}
