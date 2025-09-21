//search an element in array
import java.util.Scanner;

class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Naisha, 24csu315 ");
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Element to search= ");
        int target = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println(target + " found at position " + (i + 1));
                return;
            }
        }

        System.out.println(target + " not found.");
    }
}