import java.util.Scanner;

public class methodPrintSUm {
    public methodPrintSUm(int i) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        sum(num,num1);


    }

    static void sum(int num,int numm) {
        int sum = num + numm;
        System.out.println(sum);
    }
}
