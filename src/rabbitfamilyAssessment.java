import java.util.Scanner;

public class rabbitfamilyAssessment{

    public static long findFibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("8. The Rabbit’s Family (Fibonacci)");
        System.out.print("Enter number of months n: ");
        int input = scanner.nextInt();
        System.out.println("Number of rabbits: " + findFibonacci(input));
        scanner.close();
    }
}
