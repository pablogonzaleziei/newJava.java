import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        // Printing "Hello, World!" to the console
        System.out.println("Hello, World!");

        // Declaring and initializing variables
        int number1 = 5;
        int number2 = 10;
        int sum = number1 + number2;
        System.out.println("Sum of " + number1 + " and " + number2 + " is: " + sum);

        // Getting user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Using conditional statements (if-else)
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Using a loop (for loop)
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a new line after the loop.

        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================

        // Creating a Calculator object
        Calculator calculator = new Calculator();

        // Performing operations using the Calculator class
        int result1 = calculator.add(5, 3);
        int result2 = calculator.subtract(10, 4);
        int result3 = calculator.multiply(6, 5);
        double result4 = calculator.divide(15, 4);

        System.out.println("Result of addition: " + result1);
        System.out.println("Result of subtraction: " + result2);
        System.out.println("Result of multiplication: " + result3);
        System.out.println("Result of division: " + result4);

        // Closing the scanner
        scanner.close();
    }
}

class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
    }
}