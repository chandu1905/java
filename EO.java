//1.WAP TO CHECK GIVEN NUMBER IS EVEN OR ODD
import java.util.Scanner;
class EO 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
			int num;
			System.out.println("enter a number");
		num=sc.nextInt();

		if(num%2==0)
		{
				System.out.println(num + "is even ");
		}
		else
		{
				System.out.println(num + "is odd ");
		}
		System.out.println("Hello World!");
	}
}
