package transport;

public class main {
    public static void main(String[] args){
        Car c = new Car("maruti","800",4,5,"Automatic");
        c.startEngine();
        c.startAC();
        c.stopEngine();
        motorCycle m = new motorCycle("Splender", "Xline", 2, "U","soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
        

    }
}
