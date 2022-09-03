import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MethodTakeInputTllX {
    public static void main(String[] args) {

        user();
    }
    static void user() {
        int answer = 0;
        ArrayList<Integer> sum = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String input;
        do {
            input = sc.nextLine();
            if (!Objects.equals(input, "x")) {
                sum.add(Integer.valueOf(input));

                for (int i = 0; i < sum.size(); i++) {
//                    System.out.println("ans="+answer);
                    answer +=  sum.get(i);

//                    System.out.println(answer+" v "+sum.get(i));
                }
            }

        } while (!Objects.equals(input, "x"));

        System.out.println(answer);

    }
}
