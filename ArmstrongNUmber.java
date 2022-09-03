import java.util.Scanner;

public class ArmstrongNUmber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1= input.nextInt();
        int num2 = input.nextInt();

        for (int i = num1; i < num2; i++) {
            int rem, check, sum = 0;
            check = i;

            while (check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if (sum == i) {
                System.out.println("" + sum + "armstrong");
            }
//          /  else System.out.println(""+sum+"not armstrong");

        }

//        int reminder = 0;
//        int reverse = 0;
//        int answer = 0;
//        for (int i = num1; i<num2; i++){
//            int check, rem, sum = 0;
//            check = i;
//            while(check != 0) {
//                rem = check % 10;
//                sum = sum + (rem * rem * rem);
//                check = check / 10;
//            }
//            if(sum == i){
//                System.out.println(""+i+" is an Armstrong number.");
//            }
//        }
//        for (int i = a; i <b; i++) {
//            int check = i;
//            for (int j = 0; j < check; j++) {
//
//                reminder = check % 10;
////                reverse = reminder * reminder * reminder;
//                answer =answer+(reminder * reminder * reminder);
//                check = check/10;
//            }
//            if (i == answer) {
//                System.out.println(answer);
//            }
//            System.out.println(answer);
//
////            a++;
//
//        }



//        a++;
//        while (a != b) {
//            for (int i = 0; i < a; i++) {
//                reminder = a % 10;
//                reverse = reminder * reminder * reminder;
//                answer += reverse + 0;
//                a = a / 10;
//            }
//            if (a == answer) {
//                System.out.println(answer);
//            }
//            System.out.println(answer);
//            a++;
//        }



    }
}
