interface A {
    void methodA();
}

interface B {
    void methodB();
}

interface C extends A, B {
    void methodC();
}

class Demo implements C {
    public void methodA() {
        System.out.println("Method A implemented.");
    }

    public void methodB() {
        System.out.println("Method B implemented.");
    }

    public void methodC() {
        System.out.println("Method C implemented.");
    }
}

public class ClassTest3 {
    public static void main(String[] args) {
        System.out.println("Mokshita Rana, 24csu308");
        Demo obj = new Demo();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
