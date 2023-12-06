import java.util.Scanner;

public class ClassA {
    public static void selectSubClass() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You've chosen ClassA. Choose a subclass:");
        System.out.println("1. SubClassA1");
        System.out.println("2. SubClassA2");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                SubClassA1.run();
                break;
            case 2:
                SubClassA2.run();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
