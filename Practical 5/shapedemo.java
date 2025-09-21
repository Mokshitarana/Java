import java.util.Scanner;
class shapedemo {
    public static void main(String[] args) {
        System.out.println("Mokshita Rana, 24csu308");
        Square s = new Square();
        s.printShape();
        s.printRectangle();
        s.printSquare();
    }
}

class Shape {
    void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    void printCircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}