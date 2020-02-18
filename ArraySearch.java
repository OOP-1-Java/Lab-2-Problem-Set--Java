import java.util.Scanner;
public class ArraySearch {

	public static void main(String[] args) {
		System.out.println(" Enter the array size :");
		Scanner in=new Scanner (System.in);
		int n;
		n=in.nextInt();
		System.out.println(n);
		int x[]= new int [n];
		
		System.out.println("Enter the Array's element  :");
		for (int j=0; j <=n; j++)
		{
			x[j]=in.nextInt();
		}
		for (int z=0; z<=n; z++)
		{
			System.out.println("The array : "+x[z]);
		}
		System.out.println("Enter the element which You want to search :");
		int s;
		s=in.nextInt();
		for (int m=0; m<=n; m++)
		{
				if (m==s)
				{
					System.out.println("The element exist in this Array !!!");
				}
				else 
				{
					System.out.println("The element doesn't exist in this Array ");
				}
		}
	}

}
