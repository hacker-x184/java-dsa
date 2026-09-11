import java.util.Scanner;
public class num_add{
    static int numadd(int a, int b){
        int result = a + b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number here 1:=");
        int a = sc.nextInt();
        System.out.println("Enter Your number here 1:=");
        int b = sc.nextInt();
        int result = numadd(a,b);
        System.out.println(result);
    }

}