import java.util.Scanner;

public class assignmentclass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int val = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = val++;
            }
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isPattern = false;

                if (ch == 'Z') {
                    if (i == 0 || i == n - 1 || i + j == n - 1) {
                        isPattern = true;
                    }
                } else if (ch == 'D') {
                    if (j == 0 || i == 0 || i == n - 1 || j == n - 1) {
                        isPattern = true;
                    }
                } else if (ch == 'A') {
                    if (i == 0 || j == 0 || j == n - 1 || i == (n - 1) / 2) {
                        isPattern = true;
                    }
                } else if (ch == 'X') {
                    if (i == j || i + j == n - 1) {
                        isPattern = true;
                    }
                }

                if (isPattern) {
                    sum += matrix[i][j];
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(sum);

        scanner.close();
    }
}
