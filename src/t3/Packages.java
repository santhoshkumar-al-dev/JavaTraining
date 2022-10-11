package t3;
import java.util.Scanner;

public class Packages {

	public static void main(String[] args) {
		System.out.println("Enter the value of a and b: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Sum of a and b is: "+c);
		
		sc.close();
	}
}
