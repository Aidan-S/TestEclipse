package test;
import java.util.Scanner;

public class hello {
	
	public static void main(String args[]){
	      
	      System.out.println("Enter two integers to calculate their sum ");
	      Scanner kb = new Scanner(System.in);
	      double a = kb.nextInt();
	      double b = kb.nextInt();

	      System.out.println("Sum = " + sum(a,b));
	      System.out.println("Dif = " + dif(a,b));
	      System.out.println("Div = " + div(a,b));
	      System.out.println("Mult = " + mult(a,b));
	      
	}
	
	public static double sum (double a, double b){
		return a + b;
	}
	
	public static double dif (double a, double b){
		return a - b;
	}
	
	public static double div (double a, double b){
		return a / b;
	}
	
	public static double mult (double a, double b){
		return a * b;
	}

}
