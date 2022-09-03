import java.util.Arrays;

public class LeetCodeFlippingAnImage {
    public static void main(String[] args) {
        int[][] array={
                {1,1,0,0}
                ,{1,0,0,1},
                {0,1,1,1}
                ,{1,0,1,0}

        };
        System.out.print(Arrays.deepToString(flipAndInvertImage(array)));

    }
    static  int[][] flipAndInvertImage(int[][] image) {
        int colLength=0;
        for (int row = 0; row < image.length; row++) {
            for (colLength = 0; colLength < image[row].length;) {
                colLength++;
            }
        }
        int[][] answer=new int[image.length][colLength];
        // int[][] answer=new int[image.length][];
        for (int row = 0; row < image.length; row++) {
            int increase = 0;
            for (int col = image[row].length-1; col >= 0; col--) {
                if (increase <= image[row].length) {
                    answer[row][increase] = image[row][col];
                    if (answer[row][increase] == 0) {
                        answer[row][increase] = 1;
                    } else if (answer[row][increase] == 1) {
                        answer[row][increase] = 0;
                    }
                    increase++;
                }


            }
        }
        return answer;

    }
}
