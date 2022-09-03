import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int reverse = 0;
//        Scanner input = new Scanner(System.in);
        //
//        int a = input.nextInt();
//int reverse = 0;
        int reminder = 0;
        int a= 1211;
            int answer = 0;

        while (a != 0) {

            reminder = a % 10;
            answer= answer * 10 + reminder;
            a = a / 10;


        }
        String aa=String.valueOf(a);
        String rr=String.valueOf(reverse);
        int n=aa.length()-1;

        int i = 0;
        while (i < n) {
            if (aa.charAt(i) != rr.charAt(i)) {
                System.out.println(false);
            }

            i++;
        }
    }
}
