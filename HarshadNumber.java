import java.util.Scanner;
class HarshadNumber 
{
	public static void main(String[] args) 
	{
		int num,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num=sc.nextInt();
		int temp=num;
		while(num!=0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		if(temp%sum==0)
		{
			System.out.println("harshad number");

		}
		else
			System.out.println("not harshad number");


	}
}
