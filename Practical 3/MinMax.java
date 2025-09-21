//min and max element
import java.util.Scanner;
class MinMax{
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

       System.out.println("Naisha Tyagi , 24csu315 ");
       System.out.println("enter the size of array: ");
int size= sc.nextInt();
int i;
int arr[] = new int[size];

for(i=0; i<size; i++){
System.out.println("enter number"+ i);
arr[i]= sc.nextInt();
}
 System.out.print( "{ ");
for(i=0; i<size; i++){
  System.out.print(arr[i] + " ");
}
 System.out.println( "} ");



int max=0; 

for(i=0; i<size; i++){
  if(arr[i]>=max){
  max=arr[i];
}
}
System.out.println("max element in array= " + max);

int min=arr[0];
for(i=0; i<size; i++){
  if(arr[i]<min){
  min=arr[i];
} 
}
System.out.println("min element in array= " + min);
  }}