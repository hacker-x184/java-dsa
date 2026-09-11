import java.util.Scanner;

public class findMax {
    static void find_max(int a, int b,int c){
        if (a>b && a>c){
            System.out.print("The number One is the greatest :-");
            System.out.println(a);
        }
        else if(b>a &&b>c){
            System.out.print("The number Two is the greatest :-");
            System.out.println(b);
        }
        else if(c>a &&b<c){            
            System.out.print("The number Third is the greatest :-");
            System.out.println(c);
        }
        else{
            System.out.println("One of the numbers are same");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : - ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number : - ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Third number : - ");
        int num3 = sc.nextInt();
        find_max(num1,num2,num3);
        
    }
}
