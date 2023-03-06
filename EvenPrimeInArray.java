import java.util.Scanner;
class  EvenPrimeInArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		int count;
		System.out.println("enter values of array: ");
			for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			count=0;
			for(int j=2;j<=a[i]/2;j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("the cube of prime number"+a[i]+" is " +a[i]*a[i]*a[i]);
			}
			if(a[i]%2==0)
			{
				System.out.println("the square of even number"+a[i]+" is " +a[i]*a[i]);
			}
		}
	}
}
		
