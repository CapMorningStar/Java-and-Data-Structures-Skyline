import java.util.Scanner;

public class MenuCommand {
    public enum Command {
        START, STOP, PAUSE, EXIT
    }

    public static void executeCommand(Command command) {
        switch (command) {
            case START:
                System.out.println("System starting...");
                break;
            case STOP:
                System.out.println("System stopping...");
                break;
            case PAUSE:
                System.out.println("System pausing...");
                break;
            case EXIT:
                System.out.println("Exiting system...");
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter command (START, STOP, PAUSE, EXIT):");
            String userInput = scanner.nextLine().toUpperCase();
            try {
                Command command = Command.valueOf(userInput);
                executeCommand(command);
                if (command == Command.EXIT) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid command. Please try again.");
            }
        }
        scanner.close();
    }
}
