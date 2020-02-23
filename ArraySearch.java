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
		for (int j=0; j <n; j++)
		{
			x[j]=in.nextInt();
		}
		for (int z=0; z<n; z++)
		{
			System.out.println("The array elements : "+x[z]);
		}
		int s,c=0;
		System.out.println("Enter the element which You want to search :");
		
		s=in.nextInt();
		for (int m=0; m<n; m++)
		{
				if (x[m]==s)
				{
					 c=1;
				}
				else 
				{
					int d =2;
				}
		}
		
		if (c==1)
		{
			System.out.println("Found !!!");
		}
		else
			System.out.println("Not Found....");
	}

}
