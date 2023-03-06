//WAP TO ENTER A NUMBER AND DISPLAY THE SUM OF EVEN DIGITS ONLY
import java.util.Scanner;
class  SumOfEvenDigits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num,sum=0,digit;
		System.out.print("ENTER A NUMBER: ");
		num=sc.nextInt();
		do
		{
			digit=num%10;
			if(digit%2==0)
			{
				sum=sum+digit;
			}
			num=num/10;
		}
		while (num!=0);
		System.out.println("the sum of even numbers in given number are: "+sum);

	}
}
