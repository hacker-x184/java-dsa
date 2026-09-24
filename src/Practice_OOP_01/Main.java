package Practice_OOP_01;

public class Main {
    static void main() {
        Developer d1 = new Developer("luffy",15000.45,"Python");
        d1.showSkill();
        d1.setSkill("java");
        d1.showSkill();
        d1.getName();
        d1.setName("zoro");
        d1.getName();
    }
}
