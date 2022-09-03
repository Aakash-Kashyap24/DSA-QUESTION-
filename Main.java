import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ::");
        num1 = sc.nextInt();
        System.out.println("Enter the second number ::");
        num2 = sc.nextInt();

        int count = 0;
        int n = num1;
        for (;num1 != 0;) {
            int reminder = num1 % 10;
            if (num2 == reminder) {
                count++;
            }
        num1 = num1 / 10;


        }

        System.out.println(count);


    }


}
