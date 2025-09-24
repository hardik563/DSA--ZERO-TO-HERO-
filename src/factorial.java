import java.util.*;
class factorial {
    static int fact(int n) {
        if(n<=1) return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALUE FOR WHICH YOU WANT TO FIND THE FACTORIAL OF:");
        int n = sc.nextInt();
        System.out.println("ANSWER IS");
        System.out.println(fact(n));
    }
}
