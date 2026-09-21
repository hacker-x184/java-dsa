package Polymorphim;

public class main {

    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.add(14,2));
        System.out.println(c.add(14,2));
        System.out.println(c.add(10,20,30));
        System.out.println(c.add(10,20,30,40));
        Circle ci = new Circle();
        ci.draw();
        doDrawingStuff(ci);
        Rect r = new Rect();
        r.draw();


    }
    public static void doDrawingStuff(Shape s){
        s.draw();
        Circle c = (Circle)s;
        c.draw();
        c.personal();
    }
}
