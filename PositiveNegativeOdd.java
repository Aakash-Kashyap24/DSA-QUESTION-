import java.util.ArrayList;
import java.util.Scanner;

public class PositiveNegativeOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int oSum = 0, eSum = 0, nSum = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;

            }
            if (n < 0) {
                nSum += n;
            }
            if (n %2==0) {
                eSum += n;
            }
            if (n %2!=0) {
                oSum += n;}
        }
        System.out.println("odd " + oSum);
        System.out.println("even " + eSum);
        System.out.println("negative " + nSum);


    }
}
