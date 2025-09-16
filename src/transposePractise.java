import java.util.Scanner;

public class transposePractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS:");
        int rows = sc.nextInt();
        System.out.println("ENTER NUMBER OF COLUMN:");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("ENTER ELEMENT IN AN ARRAY:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

       // for (int i = 0; i < rows; i++) {
         //   for (int j = 0; j < cols; j++)
           //     System.out.print(matrix[i][j] + " ");
            //System.out.println();
        //}
        System.out.println("THE TRANSPOSE MATRIX IS:");
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++)
                System.out.print(transpose[i][j] + " ");
            System.out.println();
        }
    }
}
