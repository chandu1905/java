import java.util.Scanner;
class NoOfDigits 
{
	public static void main(String[] args) 
	{
		int num,digit,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		num=sc.nextInt();
		do
		{
			digit=num%10;
			count++;
			num=num/10;
			
		}
		while (num!=0);
		{

	}
	System.out.println("THE NUMBER OF DIGITS IN GIVEN NUMBER ARE : "+count);
}
}
