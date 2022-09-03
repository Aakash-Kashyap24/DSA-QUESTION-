import java.util.Scanner;

public class MethodTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        table(num);
    }

    static void table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * num);
        }
    }
}
