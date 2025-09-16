import java.util.Scanner;
public class rotatePractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW:");
        int row = sc.nextInt();
        System.out.println("ENTER NUMBER OF COLUMN");
        int col = sc.nextInt();
        System.out.println("ENTER ELEMENT IN AN ARRAY:");
        int[][] matrix = new int[row][col];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("ROTATE MATRIX IS:" );
        int[][] rotated = new int[col][row];
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++)
                rotated[j][row - 1 - i] = matrix[i][j];
        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++)
                System.out.print(rotated[i][j] + " ");
            System.out.println();
        }
    }
}
