import java.util.Scanner;

public class PrimeOrNot01 {

    public static void main(String[] args) {
        System.out.println("Enter Your Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        if (c == 2)
            System.out.println("Prime number");
        else
            System.out.println("non-prime number");
        sc.close();
    }

}
