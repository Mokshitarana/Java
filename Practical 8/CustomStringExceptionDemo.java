import java.util.Scanner;

class MyStringException extends Exception {
    private String message;

        MyStringException(String msg) {
        this.message = msg;
    }

        void printMessage() {
        System.out.println("Stored Exception Message: " + message);
    }
}

public class CustomStringExceptionDemo {
    public static void main(String[] args) {
     System.out.println("Mokshita Rana, 24csu308");

        try {
                  throw new MyStringException("This is a user-defined exception message!");
        } catch (MyStringException e) {
            e.printMessage();
        }
    }
}