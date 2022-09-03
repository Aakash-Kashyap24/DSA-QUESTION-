import java.util.Scanner;

public class MethodsForOddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        System.out.print(check(num));
        check(num);
    }

    static void check(int a) {
        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println("even Number");

            }
            else System.out.println("Odd");
        }
        else System.out.println("invalid");
//        return a;
    }
}
