//pattern printing: pyramid, left triangle, right triangle, rhombus
import java.util.Scanner;
class Patterns{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Mokshita Rana, 24csu308");
int n=5;
System.out.println("Left Triangle:");
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print("*");}
System.out.println();}
    System.out.println("Right Triangle:");
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
System.out.println("Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");}
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    System.out.println("Rhombus:");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();}}}