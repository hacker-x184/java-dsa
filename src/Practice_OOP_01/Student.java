package Practice_OOP_01;

public class Student {
    private String name;
    private int rollNumber;
    private int marks;
    public Student(){
        System.out.println("Student is created...");
    }
    public Student(String name ,int rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public void setName(String name){
        this.name = name;
        System.out.println("Name is successfully Setted..");
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        System.out.println("Roll Number is successfully Setted..");
    }
    public void setMarks(int marks){
        if (marks>=0 && marks<=100) {
            this.marks = marks;
            System.out.println("Marks is successfully Setted..");
        }
        else{
            System.out.println("Your Marks Must be Between 0 and  100");
        }
    }
    public int getRollNumber(){
        System.out.println("Here is your roll No :- "+ rollNumber);
        return rollNumber;
    }
    public String getName(){
        System.out.println("Here is your Name :- "+ name);
        return name;
    }
    public int getMarks(){
        System.out.println("Here is your Marks :- "+ marks);
        return rollNumber;
    }

    static void main() {
        Student s1 = new Student();
        s1.setName("Luffy");
        s1.setRollNumber(01);
        s1.setMarks(50);
        s1.getName();
        s1.getRollNumber();
        s1.getMarks();
    }
}
