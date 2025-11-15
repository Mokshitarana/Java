interface Animal {
    void eat();
}

interface Pet extends Animal {
    void play();
}

class Cat implements Pet {
    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }

    @Override
    public void play() {
        System.out.println("Cat plays with yarn.");
    }
}

public class InterfaceExtend{
    public static void main(String[] args) {
System.out.println("Mokshita Rana, 24csu308");
        Cat c = new Cat();
        c.eat();
        c.play();
    }
}