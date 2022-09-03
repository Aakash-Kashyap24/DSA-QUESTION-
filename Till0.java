import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Till0 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int input;
//        String sum = null;
        ArrayList<Integer> sum = new ArrayList<Integer>();
        int max = 0;
        do {
            input = n.nextInt();
            sum.add(input);

            for (int i = 0; i < sum.size(); i++) {
                for (int j = 0; j < i; j++) {
                    max = +sum.get(j)+sum.get(i);
                }

//                if (sum.get(i) > max) {
//                    max = sum.get(i);
//                }
            }
            max = max;
            System.out.println("Gretest is"+max);

        } while (input != 0);

//        System.out.println(sum);
        System.out.println("Gretest is"+max);
    }
}
