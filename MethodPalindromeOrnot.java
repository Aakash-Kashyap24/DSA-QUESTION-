import java.util.Objects;
import java.util.Scanner;

public class MethodPalindromeOrnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int an = sc.nextInt();
        palindrome(an);
    }

     static void palindrome(int s) {

//         String ans=Integer.toString(reverse);
//         String ss=Integer.toString(s);
//         String ans = String.valueOf(reverse);
//         StringBuilder rev = new StringBuilder(reverse);
//         StringBuilder ans = new StringBuilder(s);


         for (int i = s; i < 1000; i++) {
             int rem = 0;
             int reverse = 0;
             int answ = i;
             while (answ> 0) {
                 rem = answ % 10;
                 reverse = reverse * 10 + rem;
                 answ= answ / 10;
                 if (reverse==i) {
//                     System.out.println("palindrome =" + true);
                     System.out.println(reverse);
                 }
//                 else System.out.println("palindrome ="+false);

             }

         }
    }


}
