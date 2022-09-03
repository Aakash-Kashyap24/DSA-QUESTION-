import java.util.Scanner;

public class DiscountPrice {
    public static void main(String[] args) {
        System.out.println("Enter Price");
        Scanner rs = new Scanner(System.in);
        int price = rs.nextInt();
        System.out.println("Enter Discount");
        int discount = rs.nextInt();
        int original=(price*discount)/100;
        System.out.println("Original Price "+(price-original));
    }
}
