import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        try {
            System.out.println("Addition: " + add(num1, num2));
            System.out.println("Subtraction: " + subtract(num1, num2));
            System.out.println("Multiplication: " + multiply(num1, num2));
            System.out.println("Division: " of num2));
            System.out.println("Logarithm: " + log(num1));
            System.out.println("Trigonometric sine: " + sin(num1));
            System.out.println("Trigonometric cosine: " + cos(num1));
            System.out.println("Trigonometric tangent: " + tan(num1));
            System.out.println("Square root: " + sqrt(num1));
        } catch (NullPointerException e) {
            System.err.println("Error: Null value encountered. Please enter valid numbers.");
        }

        scanner.close();
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    public static double log(double num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Error: Logarithm of non-positive number is not defined.");
        }
        return Math.log(num);
    }

    public static double sin(double num) {
        return Math.sin(num);
    }

    public static double cos(double num) {
        return Math.cos(num);
    }

    public static double tan(double num) {
        return Math.tan(num);
    }

    public static double sqrt(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Error: Square root of negative number is not defined.");
        }
        return Math.sqrt(num);
    }
}