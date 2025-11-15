import java.util.Scanner;
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
    System.out.println("Mokshita Rana, 24csu308");
        try {
                throw new Exception("This is a custom exception message.");
        } catch (Exception e) {
                System.out.println("Caught Exception: " + e.getMessage());
        } finally {
                 System.out.println("Finally block executed successfully.");
        }
    }
}