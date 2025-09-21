//Calculator prog.
import java.util.Scanner;
class Calculator{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("MOKSHITA RANA, 24CSU308");
  System.out.println("enter no1: ");
  int a = scan.nextInt();
 System.out.println("enter no2: ");
  int b = scan.nextInt();
System.out.println("enter choice(1-5): ");
  int x = scan.nextInt();
if(x==1){
System.out.println(a+b);
}
else if (x==2){
System.out.println(a-b);
}
else if (x==3){
System.out.println(a*b);
}
else if (x==4){
System.out.println(a/b);
}
else if (x==5){
System.out.println(a%b);
}
else{
System.out.println("wrong choice");
}
}
}


