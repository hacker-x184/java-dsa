public class Student {
    // Attributes
    public int id;
    public int age; 
    public  String name;
    public int nos;
    // Defult Constructure 
    // Attribute --> Garbage
    public Student(){
        System.out.println("Defualt Constructure is created");
    }
    // Parametrried Constructure
    public Student(int id,int age,String name,int nos){
        System.out.println("Parametarized Constructure is created");
        // Set Attribute
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;

    }
    // Copy constrcture
    public Student(Student srcobj){
        System.out.println("Copy Constructure is created");
        // Set Attribute
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }
    public void study(){
        System.out.println(name + " Studying");
    }
    public void sleep(){
        System.out.println(name + " Sleeping");
    }
    public void bunk(){
        System.out.println(name + " Bunking");
    }
}