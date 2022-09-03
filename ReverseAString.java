import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();
//        String name = "kol";
        int l = name.length();
        String a = "";
        char b;
//        int i = l;
//        while (i <5) {
//            a += name.charAt(i);
//            i--;
//        }
        for (int i = 0; i<name.length(); i++) {

            b = name.charAt(i);
            a = b+a;

        }
        System.out.println(a);
//        System.out.println(a);
    }
}
