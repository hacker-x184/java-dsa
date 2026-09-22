package Practice_OOP_01;

public class Car extends Vehicle{
    public int noOfDoors;
    public int noOfTyers;
    public Car(String brand,int speed,int noOfDoor,int noOfTyers){
        super(brand,speed);
        this.noOfDoors = noOfDoor;
        this.noOfTyers = noOfTyers;
    }
    void displayCarDetails(){
        System.out.println("Here is Your Car Brand : - "+ brand);
        System.out.println("Here is Your Car Speed : - "+ speed);
        System.out.println("Here is Your Car No of Doors : - "+ noOfDoors);
        System.out.println("Here is Your Car No of Tyers : - "+ noOfTyers);
    }

    static void main() {
        Car car = new Car("BMW",180,4,4);
        car.start();
        car.stop();
        car.displayCarDetails();
    }
}
