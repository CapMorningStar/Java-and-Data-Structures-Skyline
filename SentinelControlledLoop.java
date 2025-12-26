import java.util.Scanner;

public class SentinelControlledLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        System.out.println("Enter numbers. Enter -1 to stop.");
        while ((userInput = scanner.nextInt()) != -1) {
            System.out.println("You entered: " + userInput);
        }

        System.out.println("Sentinel -1 received. Exiting the loop.");
        scanner.close();
    }
}
