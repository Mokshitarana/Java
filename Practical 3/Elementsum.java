//sum of all elements and alternate elements
import java.util.Scanner;

class Elementsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Naisha,24csu315 ");
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int sumall = 0;
        int sumalt = 0;

        for (int i = 0; i < n; i++) {
            sumall += arr[i];
            if (i % 2 == 0) { 
                sumalt += arr[i];
            }
        }

        System.out.println("Sum of all elements: " + sumall);
        System.out.println("Sum of alternate elements: " + sumalt);
    }
}