import java.util.Scanner;

 public class kingtreasurreAssessment {

    public static long calculateSum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + calculateSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3. The King’s Treasury (Sum of First n Numbers)");
        System.out.print("Enter an integer n: ");
        int input = scanner.nextInt();
        System.out.println("Total coins: " + calculateSum(input));
        scanner.close();
    }
}
