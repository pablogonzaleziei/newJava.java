



import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        // Control Structures: If-else
        int number = 25;
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Control Structures: Switch
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");
        int dayNumber = scanner.nextInt();
        String day;
        switch (dayNumber) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
                break;
        }
        System.out.println("The day is: " + day);

        // Arrays
        int[] numbersArray = { 1, 2, 3, 4, 5 };
        System.out.println("Array elements:");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i] + " ");
        }

        // Classes and Objects
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Jane", 25);

        System.out.println("\n\nPerson 1:");
        person1.displayInfo();
        System.out.println("\nPerson 2:");
        person2.displayInfo();

        // Using methods with return values
        int sum = calculateSum(10, 20);
        System.out.println("\nSum of 10 and 20 is: " + sum);

        // Using methods with parameters and return values
        int product = calculateProduct(5, 6);
        System.out.println("Product of 5 and 6 is: " + product);

        // Closing the scanner
        scanner.close();
    }

    // Method with return value
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    // Method with parameters and return value
    public static int calculateProduct(int x, int y) {
        return x * y;
    }
}

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}