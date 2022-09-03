import java.util.Scanner;

public class MethodCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        circle(r);
    }

    static void circle(int r) {
        int area = (22 / 7) * (r * r);
        int circ= 2 * (22 / 7) * r;
        System.out.println("area =" + area);
        System.out.println("circ =" + circ);

    }
}
