import java.util.Scanner;
public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String Here :--");
        String str = sc.nextLine();
        String reverseString = "";
        for (int chr = str.length()-1;chr>=0;chr--){
                reverseString = reverseString + str.charAt(chr);
        }
        if (reverseString.equalsIgnoreCase(str)){
            System.out.println("Your Given String a Palinrome");
        }
        else{
            System.out.println("Your Given String a Not a Palinrome");

        }
        sc.close();
    }
}
