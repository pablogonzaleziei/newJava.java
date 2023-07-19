import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App6 {
    public static void main(String[] args) {
        // Enums
        DayOfWeek dayOfWeek = DayOfWeek.WEDNESDAY;
        System.out.println("Today is " + dayOfWeek);

        // Date and Time API
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current Date and Time: " + currentDateTime);

        // Formatting Dates and Times
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String formattedDate = currentDate.format(dateFormatter);
        String formattedTime = currentTime.format(timeFormatter);

        System.out.println("Formatted Date: " + formattedDate);
        System.out.println("Formatted Time: " + formattedTime);

        // Additional Clean Code Tips
        // Use meaningful variable and method names
        int radius = 5;
        double area = calculateCircleArea(radius);

        // Break long lines for better readability
        String longText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";

        // Avoid magic numbers, use constants or enums instead
        final int MAX_LENGTH = 100;
        if (longText.length() > MAX_LENGTH) {
            System.out.println("Text exceeds maximum length.");
        }
    }

    // Enums
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // Date and Time Formatting
    public static double calculateCircleArea(int radius) {
        return Math.PI * radius * radius;
    }
}
