import java.util.Scanner;
class  ArrayProgram1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int i[]=new int[size];
		System.out.println("enter values");

		for(int j=0;j<i.length;j++)
		{
			i[j]=sc.nextInt();

		}
		for(int j=0;j<i.length;j++)
		{
			System.out.println("the elements in array in  are "+ i[j]);
		}
		
	}
}
