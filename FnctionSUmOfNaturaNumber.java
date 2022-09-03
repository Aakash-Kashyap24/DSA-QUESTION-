import java.util.Scanner;

public class FnctionSUmOfNaturaNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        fucntion(a);

    }

    static void fucntion(int a) {
        int sum = 0;
        for (int i = a; i > 0; i--) {
            sum += i;
        }
        System.out.println(sum);
    }
}
