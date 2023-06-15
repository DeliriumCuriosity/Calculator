import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите арифметическое выражение: ");
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println("Результат: " + result);
    }

    public static String calc(String input) throws IOException {
        String[] tokens = input.split(" ");
        int num1 = Integer.parseInt(tokens[0]);
        int num2 = Integer.parseInt(tokens[2]);
        String operator = tokens[1];

        int result;
        if (num1 >= 1 && num1 < 11 && num2 >= 1 && num2 < 11) {
            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
                default -> {
                    throw new IOException();
                }
            }
        } else {
            throw new IOException();
        }
        return String.valueOf(result);
    }
}
