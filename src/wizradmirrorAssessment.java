import java.util.Scanner;

public class wizradmirrorAssessment {

    public static String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("4. The Wizard’s Mirror (Reverse String)");
        System.out.print("Enter a string s: ");
        String input = scanner.nextLine();
        System.out.println("Reversed string: " + reverse(input));
        scanner.close();
    }
}
