import java.util.Scanner;
public class BasicMaths {
    static void printDigits(int num){
        while (num!=0){
            int reminder = 0 ;
            reminder = num%10;
            num = num/10;
            System.out.println(reminder);
        }
    }
    static int countDigits(int num){
        if (num == 0) {
            return 1;
        }  
        int count = 0 ;
        while (num!=0){
            num = num/10;
            count++;
        }
             
        System.out.println("Total number of the digits " + count);
        return count;
    }
    static int sumDigit(int num){
        int sum = 0;
        while (num!=0) {
            int digit = num%10;
            num = num/10;
            sum = sum + digit;
        }
        System.out.println("Here is the sum of the number "+sum);
        return sum;
    }
    static int reverseNumber(int num){
        int reverse = 0;
        while (num!=0){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }
        System.out.println("Here is the reverse of the number "+reverse);
        return reverse;
    }
    static void checkPalindrome(int num){
        int originalNumber = num;
        int reverse = 0;
        while (num!=0){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }
        if (originalNumber != reverse){
            System.out.println("Your Given Number is not a Palindrome");
        }
        else if (originalNumber ==reverse){
            System.out.println("Your Given Number is a Palindrome");

        }
    }
    
    static void checkeven(int num){
        if (num%2 == 0){
            System.out.println("YOur Given number is Even :-"  + num);
        }
        else{
            System.out.println("YOur Given number is Odd :-"  + num);
        }
    }

    static boolean checkPrime(int num){
        if (num < 2) {
        return false;
    }
        boolean isPrime = true;
        for (int i = 2;i<num;i++){
            if (num%i==0){
                isPrime = false;
            }
            else{
                isPrime = true;
            }
        } 
      
        return isPrime;
    }

    static int findGcd(int num1,int num2){
        int gcd = num1;
        int b = num2;
        while(b!=0){
            int reminder = gcd%b;
            gcd = b;
            b = reminder;
        }
        System.out.println("Here is the GCD of " + num1 +" and "+ num2 + " is:- "+ gcd);
        return gcd;
    }
    
    static void findLcm(int num1,int num2){
        int gcd = findGcd(num1, num2);
        int lcm = num1*num2;
        lcm = lcm/gcd;
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
    
    static void armstrong(int num){
        int sum = 0 ;
        int originalNum = num;
        int digit = 0;
        int cudeDigit= 0;
        while (num!=0) {
            digit = num%10;
            cudeDigit = digit*digit*digit;
            sum = sum + cudeDigit;
            num = num/10;
        }
        if (sum==originalNum){
            System.out.println("Your given number : "+ originalNum+ " is  Armstrong number ");
        }
        else{
            System.out.println("Your given number : "+ originalNum+ " is not a Armstrong number ");

        }
    }
    
    static void printPrime(int num){
        int i = 2;
        while (i<num) {
            if(checkPrime(i)){
                System.out.println(i);
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number Here :- ");
        int num = sc.nextInt();
        printDigits(num);
        countDigits(num);
        sumDigit(num);
        reverseNumber(num);
        checkPalindrome(num);
        checkeven(num);
        checkPrime(5);
        findGcd(62,157);
        findGcd(48, 158);
        findGcd(20, 8);
        findLcm(13, 7);
        findLcm(10, 5);
        armstrong(153);
        // printPrime(154);
        sc.close();
        
    }
}