package Practice_OOP_01;

public class Developer extends Employee{
    public String programmingLanguage;
    public Developer(String name, double salary,String programmingLanguage) {
        super(name,salary);
        this.programmingLanguage = programmingLanguage;
    }
    String showSkill(){
        System.out.println("Here is the skill of the developer "+ programmingLanguage);
        return programmingLanguage;
    }
    void setSkill(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
        System.out.println("Skill is successfully setted..");
    }
}
