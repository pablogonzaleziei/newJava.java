## App2

1. We use control structures like `if-else` to determine whether a given number is even or odd.

2. We used a `switch` statement to map a given day number to its corresponding day name.

3. We introduced arrays and used a `for` loop to iterate through the elements of an array and print them.

4. We created a simple `Person` class with a constructor and a method (`displayInfo`) to display information about a person.

5. We added two methods: `calculateSum` and `calculateProduct`, to demonstrate how to use methods with return values and parameters.

## App3


1. We introduce the concept of inheritance, creating subclasses `Cat` and `Dog` that extend the `Animal` class. 
Each subclass overrides the `makeSound` method and has its own `displayInfo` method.

2. We explore the importance of encapsulation by using private access modifiers for the `BankAccount` class's variables (`accountHolder`, `accountNumber`, and `balance`). 
We provide public methods (`deposit`, `withdraw`, `displayBalance`, and `setBalance`) to access and manipulate these private variables.

3. We use the `protected` access modifier for the `name` and `age` variables in the `Animal` class. 
This allows the subclasses (`Cat` and `Dog`) to access these variables directly.

## App4

1. We demonstrated method overloading, where multiple methods have the same name but different parameter lists. In the `App` class, we have three sum methods that can handle different types and numbers of arguments.

2. We introduced abstract classes by creating a `Shape` abstract class. The Circle and `Rectangle` classes extend the `Shape` class and implement the abstract method `calculateArea()`.

3. We explored interfaces by defining the `Vehicle` interface with two methods: `start()` and `stop()`. The `Car` and `Bicycle` classes implement the Vehicle interface, providing their own implementation for the interface's methods.





- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
