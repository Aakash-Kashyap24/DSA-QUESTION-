import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
//        for (int i = 1; i <= number1; ++i) {
//
//            // if number is divided by i
//            // i is the factor
//            if (number1 % i == 0) {
//                System.out.print(i + " ");
//            }
//        }
        for (int i = 1; i <= number1; ++i) {
            if (number1 % i == 0) {
                System.out.print(" "+i);
            }
        }
    }
}
