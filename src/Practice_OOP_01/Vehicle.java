package Practice_OOP_01;

public class Vehicle {
    public String brand;
    public int speed;
    public Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    void start(){
        System.out.println("Car is Started...");
    }
    void stop(){
        System.out.println("Car is Stoped...");
    }
}
