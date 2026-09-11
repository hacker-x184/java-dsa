import java.util.Scanner;
public class mathsmatic{
    static void factorial(int num){
        int factorial = 1;
        for (int i =1 ; i<=num ; i++){
            factorial = factorial*i;
        }
        System.out.print("Here is the vlue of the factorial of your number :- ");
        System.out.println(factorial);
    }
    static void numSqure(int num){
        int result = num*num;
        System.out.print("Here is the Square of you number :-- ");
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number that you want a factorial :- ");
        int num = sc.nextInt();
        factorial(num);
        System.out.print("Enter Your Number that you want a Square :- ");
        int num2 = sc.nextInt();
        numSqure(num2);
    }
}
