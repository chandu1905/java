import java.util.Scanner;
class MaxInArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");

		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter values");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}

		
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println("the maximum value in array is " +max);
	}
}
