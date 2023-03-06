import java.util.Scanner;
class  AverageOfArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		double sum=0,average;
		System.out.println("enter values of array");
			for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		average=sum/a.length;
		System.out.println(average);
	}
}
