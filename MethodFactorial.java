import java.util.Scanner;

public class MethodFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        factorail(i);
    }

    static void factorail(int n) {
        int fact = 1;
        for (int i = 1; i <=n; i++) {
                fact = fact* i ;
                System.out.println(fact);

        }
    }
}
