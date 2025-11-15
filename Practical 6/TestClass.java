
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

interface Pet {
    void play();
}

interface Wild {
    void hunt();
}

class Dog extends Animal implements Pet, Wild {
    @Override
    public void play() {
        System.out.println("Dog loves to play fetch!");
    }

    @Override
    public void hunt() {
        System.out.println("Dog can hunt when trained.");
    }

    @Override
    void eat() {
        System.out.println("Dog eats dog food.");
    }
}

public class TestClass {
    public static void main(String[] args) {
    System.out.println("Mokshita Rana, 24csu308");
        Dog d = new Dog();
        d.eat();
        d.play();
        d.hunt();
    }
}