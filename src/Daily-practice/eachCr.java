import java.util.Scanner;
public class eachCr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String Here :--");
        String str = sc.nextLine();
        for(int chr = 0;chr<str.length();chr++){
            System.out.println(str.charAt(chr));
        }
        sc.close();
    }
}
