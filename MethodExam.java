import java.util.Scanner;

public class MethodExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        number(num);
    }

    static void number(int a) {
        if (a >= 91 && a <= 100){
            System.out.println("A+");
        }
        if (a >= 81 && a <= 90){
            System.out.println("B+");
        }
        if (a >= 71 && a <= 80){
            System.out.println("C+");
        }
        if (a >= 61 && a <= 70){
            System.out.println("D+");
        }
        if (a >= 51 && a <= 60){
            System.out.println("E+");
        }


    }
}
