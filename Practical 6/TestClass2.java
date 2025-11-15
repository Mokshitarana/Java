interface Vehicle {
    void start();
}

interface Car extends Vehicle {
    void drive();
}

class Sedan implements Car {
    public void start() {
        System.out.println("Sedan engine started.");
    }
    public void drive() {
        System.out.println("Sedan is driving smoothly.");
    }
}

public class TestClass2{
    public static void main(String[] args) {
        System.out.println("Mokshita Rana, 24csu308");
        Sedan s = new Sedan();
        s.start();
        s.drive();
    }
}
