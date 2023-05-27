package homework_module_5.JUnit_tasks;

public class Task2 {
    public static void main(String[] args) {
        printResult();
    }

    public static void printResult() {
        String str = "Hello world";
        String str2 = "Some text";
        System.out.println(contains(str));
        System.out.println(contains(str2));
    }

    public static boolean contains(String s) {
        return s.matches(".*\\bworld\\b.*");
    }
}
