import java.util.Scanner;

public class Fabnociacci {
    public static void main(String[] args) {
        Scanner uu = new Scanner(System.in);
//        int i = uu.nextInt();
        int ii = uu.nextInt();
        int l = 1;
        int i = 0;

        int answer = 0;
        for (int j= 1; j < ii;j++) {
//            l=1;
            answer = i + l;
            i = l;
            l = answer;
            System.out.println(l);
//            i++;
        }
    }


}
