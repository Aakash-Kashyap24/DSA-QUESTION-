import java.util.Scanner;

public class NUmberPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int reminder = 0;
        int reverse = 0;
        int sum = 0;
        for (int i = 0; i < num1; i++) {
            reminder = num1 % 10;
            reverse =( reverse * 10) + reminder;
            num1 = num1 / 10;

        }
        System.out.println(reverse);
    }
}
