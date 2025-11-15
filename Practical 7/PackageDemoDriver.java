package exercise.corejava;

public class PackageDemoDriver {
    public static void main(String[] args) {
        // Call the static method
        PackageDemo.display();

        // Or call the instance method
        PackageDemo demo = new PackageDemo();
        demo.displayInstance();
    }
}
