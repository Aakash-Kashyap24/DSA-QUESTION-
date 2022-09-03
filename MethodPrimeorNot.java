import java.util.Scanner;

public class MethodPrimeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        checl(a);
    }

    static void checl(int a) {


        for (int i = a; i < 200; i++) {
            if (i > 1 && i <= 3) {
                System.out.println("prime ="+true);
            } else if (i > 3) {
                if (i % 4 == 0 || i % 6 == 0 ||i%5==0|| i % 9 == 0) {
                    System.out.println("prime ="+false);

                }
                else System.out.println("prime ="+true);
            }else System.out.println("prime ="+false);
            System.out.println(i);
        }

    }
}
