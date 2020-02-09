import java.util.Scanner;
public class Rectcalc {

	public static void main(String[] args) {
		double a,l,w,peri;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter length :");
		l=x.nextDouble();
		System.out.println("Enter width :");
		w=x.nextDouble();
		a =l*w;
		peri=2*(l+w);
		System.out.println("Area of the Rectangle is :"+a);
		System.out.println("Perimetre of the Rectangle is :"+peri);
	}

}
