import java.util.Scanner;
public class calulate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String Here :--");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int len = 0;
        for (char ch :chars){
            len++;
        }
        System.out.print("Lenght of the given string "+ len);
        sc.close();
    }
    
}
