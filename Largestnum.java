	import java.util.Scanner; 
public class Largestnum {

	public static void main(String[] args) {
	double x,y,z;
	System.out.println("Enter  3 inputs  :");
	Scanner a = new Scanner (System.in);
	x=a.nextDouble();
	y=a.nextDouble();
	z=a.nextDouble();
	if (x>y)
	{
		if (x>z)
		{System.out.println("The largest number is :"+x);
	}
	}
	else if (y>z)
	{
		System.out.println("The largest number is :"+y);
	}
	else if (z>x)
	{
		System.out.println("The largest number is :"+z);
	}
		
	}
}
