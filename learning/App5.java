import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        // Exception Handling: Handling File I/O
        try {
            // Write data to a file
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Hello, World!\n");
            writer.write("This is a sample text.\n");
            writer.close();

            // Read data from the file
            File file = new File("data.txt");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred while working with the file.");
            e.printStackTrace();
        }

        // Collections: List
        List<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");

        System.out.println("\nNames List:");
        for (String name : namesList) {
            System.out.println(name);
        }

        // Collections: Map
        Map<String, Integer> scoresMap = new HashMap<>();
        scoresMap.put("Alice", 85);
        scoresMap.put("Bob", 92);
        scoresMap.put("Charlie", 78);

        System.out.println("\nScores Map:");
        for (Map.Entry<String, Integer> entry : scoresMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Generics
        Box<Integer> intBox = new Box<>(10);
        Box<String> stringBox = new Box<>("Hello, Generics!");

        System.out.println("\nInteger Box: " + intBox.getItem());
        System.out.println("String Box: " + stringBox.getItem());
    }
}

class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
