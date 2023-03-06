//WAP TO ENTER A NUMBER AND DISPLAY THE REVERSE OF A NUMBER
import java.util.Scanner;
class ReverseDigit
{
	public static void input()
	{
		int num,digit,reverse=0,num1;
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A NUMBER: ");
		num=sc.nextInt();
		num1=num;
		do
		{
			digit=num%10;
			System.out.print(digit);
			//reverse=reverse*10+digit;

			num=num/10;
		}
		while (num!=0);
		//System.out.println("THE NUMBER BEFORE REVERSE IS : "+num1);
		//System.out.println("THE NUMBER AFTER REVERSE IS : " +reverse);
	}
	public static void main(String[] args)
	{	
		input();
		

	}
}
