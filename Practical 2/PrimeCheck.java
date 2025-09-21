//wap to chk a no. is prime or not
import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
 System.out.println("Mokshita Rana, 24csu308 ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        }
 else 
{
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
          }
          }
        }

        if (isPrime) {
            System.out.println(num + " is a prime no.");
        }
 else 
{
            System.out.println(num + " is not a prime no.");
     }
  }
}