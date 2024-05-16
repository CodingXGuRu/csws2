import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("You entered the number: " + number);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid number format. Please enter a valid number.");
        }

        scanner.close();
    }
}