import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("ENTER NAME");
        Scanner user = new Scanner(System.in);
        String name = user.nextLine();
        System.out.println("Good MOrning " + name.toUpperCase());
    }
}
