//vowel or consonant

import java.util.Scanner;
class strings 
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Mokshita Rana, 24csu308");
char st;
System.out.println("enter the character");
st= sc.next().toLowerCase().charAt(0);
if(st>='a' && st<= 'z'){

if (st == 'a' || st=='e' || st=='i' || st=='o' || st=='u' )
{
System.out.print("the given char is a vowel " );
}
else{
System.out.print("the given char is consonant" );
}
}
else {
System.out.print("enter a valid input : " );
}
}

}
