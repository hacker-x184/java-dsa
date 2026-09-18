package transport;

public class motorCycle extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;
    motorCycle(String name,String model,int noOfTyres,String handleBarStyle,String suspensionType){
        super(name,model,noOfTyres);
        this.handleBarStyle=handleBarStyle;
        this.suspensionType=suspensionType;
    
    }
    public void wheelie(){
        System.out.println("MotoCycle is doing wheeelie"+name);
    }
}

