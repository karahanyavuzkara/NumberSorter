package patika;
import java.util.Scanner;
public class NumberSorting {

public static void main(String[]args) {

 int a, b , c ;

   System.out.print("Enter the first number(a) : ");
   Scanner input = new Scanner(System.in);
   
   a = input.nextInt();
   
   System.out.print("Enter the second number(b) : ");
   b = input.nextInt();
   
   System.out.print("Enter the third number(c) : ");
   c = input.nextInt();
   
   if (((a < b ) && ( a < c )) && (b < c )){
      System.out.print(" a < b < c ");
   }
   if (((a < b ) && ( a < c )) && (b > c )){
	      System.out.print(" a < c < b ");
   }
   if (((b < a ) && ( b < c )) && (a < c )){
	      System.out.print(" b < a < c ");
   }
   if (((b < a ) && ( b < c )) && (a > c )){
	      System.out.print(" b < c < a ");
   }
   if (((c < a ) && ( c < a )) && (b > a )){
	      System.out.print(" c < a < b ");
   }
   if (((c < a ) && ( c < a )) && (b < a )){
	      System.out.print(" c < b < a ");
   }
}
} 

