import java.util.ArrayList;
import java.util.Arrays;

public class LeetCodeMediumSpiral {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

//        ArrayList<Integer> ans = new ArrayList<>();

        String first = "";
        String last = "";
        String lasts = "";
        int middle = 0;
        for (int i = matrix.length - 1; i > matrix.length - 2; i--) {
            middle = matrix[i - 1][matrix.length-1];
        }
        for (int i = 0; i <= matrix.length - 2; i++) {
            lasts += String.valueOf(matrix[matrix.length - 2][i]);
        }
        for (int row = 0; row < matrix.length; row++) {
            first += String.valueOf(matrix[0][row]);
        }
        for (int col = matrix[matrix.length-1].length-1; col >= 0; col--) {
            last += String.valueOf(matrix[matrix.length - 1][col]);
//                row++;
        }

        String f = first+ String.valueOf(middle)+last + lasts;
        int answer = Integer.parseInt(f);
        int apl=matrix.length * matrix[0].length;
        ArrayList<Integer> ans = new ArrayList<Integer>(apl);

        int[] anss = new int[matrix.length* matrix[0].length];
        int tt = apl;
        int r = 0;
//        while (answer != 0) {
//            r = answer % 10;
//
//        }
//        for (int i = 0; i < apl-1; i++) {
//            ans.add(i, 0);
//        }
        for (int i = apl-1; i>=0; i--) {
            anss[i] = answer % 10;
            answer = answer / 10;
//            ans[i]=ans

        }
        for (int i = 0; i < apl; i++) {
            ans.add(i, anss[i]);
        }
//        System.out.println(first);
//        System.out.println(last+lasts);
        System.out.println(ans);

        System.out.print(Arrays.toString(anss));

    }
}
