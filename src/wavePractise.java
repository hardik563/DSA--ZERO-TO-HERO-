import java.util.*;
public class wavePractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS:");
        int row = sc.nextInt();
        System.out.println("ENTER NUMBER OF COLUMN:");
        int cols = sc.nextInt();
        int[][] arr = new int[row][cols];
        System.out.println("ENTER ELEMENT IN AN ARRAY:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {

                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("THE WAVE MATRIX IS:");
        for (int j = 0; j < cols; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < row; i++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println(" ");
            } else {
                for (int i = row - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
