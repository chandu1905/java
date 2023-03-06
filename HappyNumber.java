
import java.util.Scanner;
class HappyNumber 
{
	public static void main(String[] args) 
	{
		int num,sum=0,digit,square;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		num=sc.nextInt();
		while (num>0)
		{
			square=num*num;
			digit=square%10;
			product=digit*digit;
			sum=sum+product;
			square=square/10;




		}

	}
}
