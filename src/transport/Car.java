package transport;

public class Car extends Vehicle {
    public int noOfDoors;
    public String transmissinType;
    public Car(String name,String model,int noOfTyres,int noOfDoors,String trnsmissionType){
        super(name, model, noOfTyres);
        this.noOfDoors=noOfDoors;
        this.transmissinType = trnsmissionType;
    }
    public void startAC(){
        System.out.println("Ac is started of : - "+ name);
    }
}
