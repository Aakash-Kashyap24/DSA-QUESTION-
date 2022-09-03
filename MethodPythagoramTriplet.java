import java.util.ArrayList;
import java.util.Scanner;

public class MethodPythagoramTriplet {
    public static void main(String[] args) {

        triplet();

    }

    static void triplet() {

        int i = 0;

        int answer = 0;
        int aa = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int a;
        while (i < 3) {
            a = sc.nextInt();
            array.add(a);
            i++;
        }
        int j = 0;

        answer = array.get(0) * array.get(0);
        answer += array.get(1) * array.get(1);
        aa = array.get(2) * array.get(2);
        if (answer == aa) {
            System.out.println("Triplet =" + true);
        } else {
            System.out.println("Triplet =" + false);
        }
    }
}


