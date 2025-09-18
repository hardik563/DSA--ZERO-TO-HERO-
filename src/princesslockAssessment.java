import java.util.Scanner;

public class princesslockAssessment {

    public static long calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("7. The Princess’s Lock (Factorial)");
        System.out.print("Enter an integer n: ");
        int input = scanner.nextInt();
        System.out.println("Factorial: " + calculateFactorial(input));
        scanner.close();
    }
}
