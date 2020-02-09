import java.util.Scanner;
public class Evenoddtest {

	public static void main(String[] args) {
		int x ;
		Scanner y = new Scanner (System.in);
		System.out.println("Enter a number  :");
		x=y.nextInt();
		if(x%2==0)
		{
			System.out.println("The number is even ");
		}
		else 
			System.out.println("The number is odd");

	}

}
