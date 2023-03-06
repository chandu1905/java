import java.util.Scanner;
class  EvenInArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		int evencount=0,oddcount=0;
		System.out.println("enter values of array");
			for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evencount++;
				System.out.println("even numbers in array are "+a[i]);
			}
			else
			{
				oddcount++;
				System.out.println("odd numbers in array are "+a[i]);
			}
			
		}
		System.out.println("the number of even numbers in array are" +evencount);
			System.out.println("the number of even numbers in array are" +oddcount);
	}
}