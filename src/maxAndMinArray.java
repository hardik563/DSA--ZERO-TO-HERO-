import java.util.*;
class maxAndMinArray {
    static int findMax(int[] arr,int n) {
        if(n==1) return arr[0];
        return Math.max(arr[n-1], findMax(arr,n-1));
    }
    static int findMin(int[] arr,int n) {
        if(n==1) return arr[0];
        return Math.min(arr[n-1], findMin(arr,n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++) a[i]=sc.nextInt();
        System.out.println("Max element in the array is: "+findMax(a,a.length));
        System.out.println("Min element in the array is: "+findMin(a,a.length));
    }
}
