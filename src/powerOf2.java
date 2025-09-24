import java.util.*;
class powerOf2 {
    static int sumPow(int n) {
        if(n==0) return 1;
        return (int)Math.pow(2,n) + sumPow(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALUE FOR WHICH YOU WANT TO FIND THE POWER OF");
        int n = sc.nextInt();
        System.out.println("ANSWER IS:");
        System.out.println(sumPow(n));
    }
}
