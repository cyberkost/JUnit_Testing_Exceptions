package homework_05_12_2023;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        inputNumber();
    }

    public static void inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        try {
            long result = factorial(n);
            System.out.println(n + " = " + result);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static long factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Negative number entered");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
