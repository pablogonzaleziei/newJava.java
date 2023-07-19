import java.util.Scanner;

public class App {
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


        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================

1. We use control structures like `if-else` to determine whether a given number is even or odd.

2. We used a `switch` statement to map a given day number to its corresponding day name.

3. We introduced arrays and used a `for` loop to iterate through the elements of an array and print them.

4. We created a simple `Person` class with a constructor and a method (`displayInfo`) to display information about a person.

5. We added two methods: `calculateSum` and `calculateProduct`, to demonstrate how to use methods with return values and parameters.



import java.util.Scanner;

public class App {
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



        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================
        // ============================================================================================================================================


1. We introduce the concept of inheritance, creating subclasses `Cat` and `Dog` that extend the `Animal` class. 
Each subclass overrides the `makeSound` method and has its own `displayInfo` method.

2. We explore the importance of encapsulation by using private access modifiers for the `BankAccount` class's variables (`accountHolder`, `accountNumber`, and `balance`). 
We provide public methods (`deposit`, `withdraw`, `displayBalance`, and `setBalance`) to access and manipulate these private variables.

3. We use the `protected` access modifier for the `name` and `age` variables in the `Animal` class. 
This allows the subclasses (`Cat` and `Dog`) to access these variables directly.


public class App {
    public static void main(String[] args) {
        // Inheritance
        Cat cat = new Cat("Whiskers", 3, "Gray");
        Dog dog = new Dog("Buddy", 5, "Golden Retriever");
        
        System.out.println("Cat:");
        cat.makeSound();
        cat.displayInfo();

        System.out.println("\nDog:");
        dog.makeSound();
        dog.displayInfo();

        // Encapsulation and Access Modifiers
        BankAccount account1 = new BankAccount("John Doe", "123456");
        account1.deposit(1000);
        account1.withdraw(500);
        account1.displayBalance();

        // Accessing a private variable directly (Not recommended!)
        // account1.balance = 2000; // This will not be allowed due to private access modifier.

        // Using public methods to access private variables (Encapsulation)
        account1.setBalance(2000);
        account1.displayBalance();
    }
}

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }
}

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Encapsulation: Using public methods to access private variables
    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        } else {
            System.out.println("Invalid balance value.");
        }
    }
}
