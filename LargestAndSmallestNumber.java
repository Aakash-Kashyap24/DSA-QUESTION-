import java.util.ArrayList;
import java.util.Scanner;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> summ = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            int num = sc.nextInt();
            summ.add(num);
        }
        int a = sum(summ);

        System.out.println(a);
    }

    static int sum(ArrayList<Integer> v) {
        int max = v.get(0);
        int min = v.get(0);

        if (v.get(1)>max ) {
            max = v.get(1);
        }
        if ( v.get(2)>max) {
            max = v.get(2);
        }
        System.out.println("max =" + max);
        if (min > v.get(1)) {
            min = v.get(1);
        }
        if (min > v.get(2)) {
            min = v.get(2);
        }

        System.out.println("min =" + min);

        return max;
    }

}
