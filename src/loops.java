public class loops {

    public static void main() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i += 2) {

            System.out.println(i);
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int testCase = 1; testCase <= 6; testCase++) {
            if (testCase == 4) {
                break;
            }
            System.out.println(testCase);

        }
        for (int day = 1; day <= 5; day++) {
            if (day == 3) {
                continue;
            }
            System.out.println(day);
        }

    }
}