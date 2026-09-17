public class App {
    public static void main(String[] args) {
        // Defult constructure of student
        Student A = new Student();
        Student B = new Student(2,18,"zoro",5,"Robin");
        // A.id = 1;
        // A.name = "Luffy";
        // A.age  = 19 ;
        // A.nos = 5;
        // System.out.println(A.name);
        // System.out.println(A.id);
        // System.out.println(A.nos);
        // System.out.println(A.age);

        A.bunk();
        A.study();
        A.sleep();
        Student C = new Student(B);
        // System.out.println(C.name);
        // System.out.println(C.id);
        // System.out.println(C.nos);
        // System.out.println(C.age);
        System.out.println(B.getName());
        C.bunk();
        C.study();
        C.sleep();
        A.setAge(184);
        System.out.println(B.getAge());

    }
}
