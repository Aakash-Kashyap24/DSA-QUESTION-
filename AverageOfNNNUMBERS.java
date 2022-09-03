import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNNNUMBERS {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int nn;
        int avg = 0;
        int sa = 0;
        ArrayList<Integer> sum = new ArrayList<Integer>();
        do {
            nn = n.nextInt();
            sum.add(nn);
            int a=sum.stream().mapToInt(Integer::intValue).sum();
//            for (int i = 0; i < sum.size(); i++) {
//                for (int j = 0; j < i; j++) {
//                    sa += (sum.get(i) + sum.get(j));
//                }
//
//            }
            avg = a/ sum.size()+1;

        }
        while (nn != 0);
        System.out.println("avg is "+avg);
    }
}
