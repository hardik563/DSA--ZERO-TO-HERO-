import java.util.Scanner;

public class echoAssessment {

    public static void printEcho(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            printEcho(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2. The Echo in the Cave (Print n to 1)");
        System.out.print("Enter an integer n: ");
        int input = scanner.nextInt();
        printEcho(input);
        scanner.close();
    }
}
