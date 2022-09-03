import java.util.Scanner;

public class VowelsChecker {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        String a = j.next();
        if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")) {

            System.out.println(true);
        }else System.out.println(false);
    }
}
