import java.util.Scanner;
public class Vatcalc {

	public static void main(String[] args) {
	double x,z;
	Scanner y=new Scanner (System.in);
	System.out.println("Enter the amount : ");
	x=y.nextDouble();
	z=x*0.15;
	System.out.println("Vat on this amount :"+z);
	

	}

}
