import java.util.Scanner;

public class MethodLeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        leapyear(year);

    }

    static void leapyear(int year) {
        if (year % 4 == 0&&year % 100 == 0&&year % 400 == 0) {
            System.out.println("its leap year");

        }
        else System.out.println("no Leap year");

    }
}
