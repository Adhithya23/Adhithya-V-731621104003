import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
