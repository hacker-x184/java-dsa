public class condition {
    static void main() {
        int dailyPractice = 12;
        if (dailyPractice >= 10) {
            System.out.println("Good Consistency!");
        }
        int score = 42;
        if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        int accuracy = 78;
        if (accuracy >= 90) {
            System.out.println("Excellent");
        } else if (accuracy >= 75) {
            System.out.println("Good");
        } else if (accuracy >= 60) {
            System.out.println("Average");
        } else {
            System.out.println("Needs Improvement");
        }
        boolean hasSubscription = true;
        int solvedProblems = 220;
        if (hasSubscription) {
            if (solvedProblems >= 200) {
                System.out.println("Unlock Advanced Sheet");
            } else {
                System.out.println("Practice More Problems");
            }
        } else {
            System.out.println("Upgrade to Premium");
        }

    }

}
