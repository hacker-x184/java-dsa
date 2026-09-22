package Abstraction;

public class Main {
    static void main() {
        Vehicle car = new Car();
        car.start();
        car.stop();
        Vehicle bike =  new Bike();
        bike.start();
        bike.stop();
    }
}
