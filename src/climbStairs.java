import java.util.*;
class  climbStairs{
    static int climb(int n) {
        if(n<=2) return n;
        return climb(n-1)+climb(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALUE :");
        int n = sc.nextInt();
        System.out.println("ANSWER IS");
        System.out.println(climb(n));
    }
}
