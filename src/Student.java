public class Student {
    // Attributes
    private int id;
    private int age; 
    private  String name;
    private int nos;
    private String gf;
    // Defult Constructure 
    // Attribute --> Garbage
    public Student(){
        System.out.println("Defualt Constructure is created");
    }
    // Parametrried Constructure
    public Student(int id,int age,String name,int nos,String gf){
        System.out.println("Parametarized Constructure is created");
        // Set Attribute
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;

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
    private void gfChatting(){
        System.out.println(name + " Chatting");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}