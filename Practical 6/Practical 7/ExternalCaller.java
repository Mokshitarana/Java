package outside;
import exercise.corejava.PackageDemo;

public class ExternalCaller {
    public static void main(String[] args) {
        PackageDemo.display();
        PackageDemo obj = new PackageDemo();
        obj.displayInstance();
    }
}


