import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number:-");
        int a  = sc.nextInt();
        System.out.print("Enter Your Number:-");
        int b = sc.nextInt();
        System.out.println("Sum of the numbers:"+(a+b));
        BigInteger bg = sc.nextBigInteger();
        System.out.println("Bigninteger: " + bg);

        System.out.println("Enter the value for flag");
        boolean flag = sc.nextBoolean();
        System.out.println("Enter the value for shortVal");
        short shortVal = sc.nextShort();
        System.out.println("Enter the value for floatValue");
        float floatValue = sc.nextFloat();

        System.out.println("flag is: " + flag);
        System.out.println("shortVal is: " + shortVal);
        System.out.println("floatValue is: " + floatValue);
    }
}