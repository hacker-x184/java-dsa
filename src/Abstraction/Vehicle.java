package Abstraction;

abstract class Vehicle {
    abstract void start();
    void stop(){
        System.out.println("Vehicle Stopped...");
    }
}
