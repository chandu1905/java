import java.util.Scanner;
class MinInArray 
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

		
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println("the minimum value in array is " +min);
	}
}
