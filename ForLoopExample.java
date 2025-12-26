import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;

        do {
            System.out.print("Enter a positive number (or -1 to exit): ");
            value = scanner.nextInt();
        } while (value != -1);

        System.out.println("You entered -1, so we exit.");
        scanner.close();
    }
}

