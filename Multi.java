import java.util.Scanner;

public class Mul {

	public static void main(String[] args) {
       int a; 
       int i;
      System.out.println("Enter an integer to print it's multiplication table");
      Scanner in = new Scanner(System.in);
      a = in.nextInt();
      System.out.println("Multiplication table of "+a+" is :-");
 
      for ( i = 1 ; i <= 30; i++ )
         System.out.println(a+"*"+i+" = "+(a*i));
   }


	}

