package corejava;
import java.util.Scanner;
public class Multiplication {

	public static void main(String [] args)
{
	Scanner scanner = new Scanner(System.in);	
	
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = a*b;
System.out.println("Multiplication is "+c);
}
}