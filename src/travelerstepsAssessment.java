import java.util.Scanner;

public class travelerstepsAssessment {

    public static int countWays(int n) {
        if (n <= 2) {
            return n;
        }
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("6. The Traveler’s Steps (Climbing Stairs)");
        System.out.print("Enter number of stairs n: ");
        int input = scanner.nextInt();
        System.out.println("Number of distinct ways: " + countWays(input));
        scanner.close();
    }
}
