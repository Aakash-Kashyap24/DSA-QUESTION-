import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);

        int height = rs.nextInt();
        int base = rs.nextInt();
        System.out.println("Area of Rectangle is "+(height*base));
    }
}
