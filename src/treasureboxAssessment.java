import java.util.Scanner;

public class  treasureboxAssessment {

    public static int sumCoins(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        return arr[index] + sumCoins(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5. The Treasure Boxes (Sum of Array)");
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();
        int[] coins = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            coins[i] = scanner.nextInt();
        }
        System.out.println("Total coins: " + sumCoins(coins, 0));
        scanner.close();
    }
}
