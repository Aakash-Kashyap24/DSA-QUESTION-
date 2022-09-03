import java.util.Scanner;

public class AreaOfTraingle {
    public static void main(String[] args) {

        Scanner rs = new Scanner(System.in);

        int height = rs.nextInt();
        int base = rs.nextInt();
        System.out.println("Area of Triangle is "+(height*base)/2);
    }


}
