import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age= sc.nextInt();
        Check(age);
    }

    static void Check(int age) {
        if (age >= 18) {
            System.out.println(true);
        } else System.out.println(false);
    }
}
