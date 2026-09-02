public class methods{
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
    return sum;  // sends this value back to whoever called this method
}
    static void main(){
        printTable();
        printSum();
        checkAge(19);
        int sum = add(15, 20);
        System.out.println(sum);
    }
}
