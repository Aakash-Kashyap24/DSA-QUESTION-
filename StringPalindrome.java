import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

//        String user12 = user.nextLine();
        String user12 = "po";
        int l = user12.length();
        StringBuilder users = new StringBuilder(user12);
        users.reverse();
        System.out.println(users);
        int ls = user12.length();

        int i = 0;
        while (i < ls) {
            if (user12.charAt(i) != users.charAt(i)) {
                System.out.println(false);
            }

            i++;
        }
    }

}
