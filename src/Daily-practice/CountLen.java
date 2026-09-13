import java.util.Scanner;
public class CountLen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String Here :--");
        String str = sc.nextLine();
        int count = 0;
        String vowel = "AEIOUaeiou";
        for(int chr = 0;chr<str.length();chr++){
            for (int vo = 0;vo<vowel.length();vo++){
                if (str.charAt(chr)==(vowel.charAt(vo))){
                    count = count+1;
                }
            
            }
        }
        System.out.println("Total vowels: " + count);
        sc.close();
    }
}
