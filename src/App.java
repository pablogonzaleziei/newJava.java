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
