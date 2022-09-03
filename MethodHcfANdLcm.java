import java.util.Scanner;

public class MethodHcfANdLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        answer(num,num2);
    }

    static void answer(int num,int num2) {
        int temp1 = num, temp2=num2,temp,hcf,lcm ;
//        int n= num2;int n2=num2;
//        int n3 = num;
//        int hcf = 0;
        while (temp2 != 0) {
            temp = temp2;
             temp2 = temp1 % temp2;
            temp1 = temp;
        }

        hcf = temp1;
        lcm = (num *num2) / hcf;
        System.out.println("H.C.F =" + hcf);
        System.out.println("L.C.M =" + lcm);

    }
}
