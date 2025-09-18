import java.util.Scanner;

public class assesmentDrumbeats {

    public static void printBeats(int n) {
        if (n > 0) {
            printBeats(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Drumbeats of the Festival (Print 1 to n)");
        System.out.print("Enter an integer n: ");
        int input = scanner.nextInt();
        printBeats(input);
        scanner.close();
    }
}
