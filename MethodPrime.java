import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class MethodPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        prime(a, b);
    }

    static void prime(int a, int b) {
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";

        for (i = a; i <= b; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);

    }
}
