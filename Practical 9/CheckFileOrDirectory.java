import java.io.File;

public class CheckFileOrDirectory {
    public static void main(String[] args) {
        System.out.println("Mokshita Rana, 24csu308");

        
        File file = new File("/Users/mokshitaa/Documents/project-root/exercise/corejava");

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println(file.getName() + " file exists.");
            } else if (file.isDirectory()) {
                System.out.println(file.getName() + " directory exists.");
            } 
        } else {
            System.out.println("File or directory does not exist.");
        }
    }
}
