import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumberProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int sum = 0;
        ArrayList<Integer> array= new ArrayList<Integer>();
        for (int i = 1; i <= num1/2; i++) {
            if (num1 % i == 0) {
                sum += i;



            }
        }
        if (sum == num1) {

            System.out.println("perfect NUmber");
        }
        else System.out.println("no");
    }
}
