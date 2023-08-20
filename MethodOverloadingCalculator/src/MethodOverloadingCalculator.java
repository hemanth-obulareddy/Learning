import java.util.Scanner;

public class MethodOverloadingCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double result = calculate(num1, num2, operator);

        System.out.println("Result: " + result);
    }

    public static double calculate(double a, double b, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }

        return result;
    }

}
