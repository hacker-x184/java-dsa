public class methods {

    static void printTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 * i);
        }
    }

    static void printSum() {
        int a = 1;
        int b = 2;
        System.out.println(a + b);
    }

    static void checkAge(int age) {
        if (age < 0) {
            return;  // exit immediately, nothing to print
        }
        System.out.println("Age is: " + age);
    }

    static int add(int p, int q) {
        int sum = p + q;
        return sum;  
    }

    static void printMultiples() {
        int value = 20;
        for (int i = 1; i <= 10; i++) {
            System.out.println(value * i);
        }
    }

    // Dummy solve method taaki solve(num) error na de
    static void solve(int n) {
        System.out.println("inside solve method with value: " + n);
    }

    // Standard Java entry point
    public static void main(String[] args) {
        printTable();
        printSum();
        checkAge(19);
        
        int resultSum = add(15, 20);
        System.out.println(resultSum);

        int num = 5;
        System.out.println("inside main : " + num);
        solve(num);
        System.out.println("inside main : " + num);

        int ans1 = add(1, 2);
        System.out.println("ans1: " + ans1);
        
        // ans2 declare nahi tha, isliye declare kar diya
        int ans2 = 10; 
        System.out.println("ans2: " + ans2);
    }
}