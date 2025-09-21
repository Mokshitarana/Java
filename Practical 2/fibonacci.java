//fibonacci series
import java.util.Scanner;
class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mokshita Rana,24csu308");
        System.out.print("Enter the no. of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

    }
}