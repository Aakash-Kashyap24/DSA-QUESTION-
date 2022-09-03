import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        System.out.println("Enter any number and checks it Odd or Even");
        Scanner input = new Scanner(System.in);
        int userA = input.nextInt();
        if (userA % 2 == 0) {
            System.out.println("Its even");

        }
        else System.out.println("ODD");


    }
}
