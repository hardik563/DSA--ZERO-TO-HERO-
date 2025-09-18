import java.util.Scanner;

public class assignment13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF TEAMS:");
        int n = scanner.nextInt();
        System.out.println("NUMBER OF PLAYER PER TEAM:");
        int m = scanner.nextInt();

        int winningTeamIndex = 0;
        int maxScore = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentTeamScore = 0;
            for (int j = 0; j < m; j++) {
                currentTeamScore += scanner.nextInt();
            }

            if (currentTeamScore > maxScore) {
                maxScore = currentTeamScore;
                winningTeamIndex = i;
            }
        }
        System.out.println("WINNING TEAM INDEX IS:");
        System.out.println(winningTeamIndex);


    }
}
