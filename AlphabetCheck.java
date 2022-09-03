import java.util.Objects;
import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        char a = j.next().trim().charAt(0);
    
        if (a>='a' && a<='z') {

            System.out.println(true);
        }else System.out.println(false);
    }
}
