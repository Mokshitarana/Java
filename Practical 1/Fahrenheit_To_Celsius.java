//to convert Fahrenheit to Celsius

import java.util.Scanner;

class Fahrenheit_To_Celsius {
  public static void main(String[] args){
     Scanner sc = new Scanner (System.in);
     System.out.println("Mokshita Rana : 24CSU308");
     float f;
     System.out.println("Enter fahrenheit temp: ");
     f = sc.nextFloat();

     float c;
     c = (f- 32) * 5f / 9f;

     System.out.println("Celsius temp= " + c);
  }
}