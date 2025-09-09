import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            try {
                System.out.println("Enter the first number:");
                double num1 = scanner.nextDouble();

                System.out.println("Enter the operator (+, -, *, /):");
                char operator = scanner.next().charAt(0);

                System.out.println("Enter the second number:");
                double num2 = scanner.nextDouble();

                double result;
                switch (operator) {
                    case '+':
                        result = add(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case '-':
                        result = subtract(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case '*':
                        result = multiply(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case '/':
                        result = divide(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    default:
                        System.out.println("Invalid operator. Please use +, -, *, or /.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input from the scanner
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Do you want to perform another calculation? (yes/no)");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("no")) {
                continueCalculation = false;
            }
        }

        scanner.close();
        System.out.println("Calculator closed. Goodbye!");
    }

    // Method for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method for division with exception handling
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}
