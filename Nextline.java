import java.util.Scanner;
class Nextline 
{
	public static void main(String[] args) 
	{
		int num,digit,reverse=0;
			Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num=sc.nextInt();
		do
		{
			digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		while (num!=0);
		System.out.println("the reverse of given number is "+reverse);
		do
		{
			digit=reverse%10;
			System.out.println(digit);
			reverse=reverse/10;

		}
		while (reverse!=0);
	}
}
