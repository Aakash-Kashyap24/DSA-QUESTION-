import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int radious = r.nextInt();
        int area = 22 / 7 *( radious*radious);
        System.out.println("Area Of This Circle is " + area);
    }

}
