import java.util.*;
class squaresSum {
    static int sumSq(int n) {
        if(n==0) {
            return 0;}
        return n*n + sumSq(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALUE OF N FOR WHICH YOU WANT TO FIND THE SUM OF SQUARE:");
        int n = sc.nextInt();
        System.out.println("ANSWER IS:");
        System.out.println(sumSq(n));
    }
}
