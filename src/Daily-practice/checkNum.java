import java.util.Scanner;

public class checkNum {
    static  void checkEven(int num){
        if (num%2 ==0 ){
            System.out.println("Your Given Number is even");
        }
        else if(num%2 !=0){
            System.out.println("Your Given Number is Odd");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter your number here : - ");
        int num = sc.nextInt();
        checkEven(num);
    }
}
