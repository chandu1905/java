//4.WAP TO ENTER A NUMBER AND DISPLAY THE NUMBERS IN ASCENDING ORDER.
import java.util.Scanner; 
class  AscendingDigits
{
	public static void main(String[] args) 
	{
		int num,digit,
		Scanner sc =new Scanner(System.in);

		System.out.println("enter a number");
		num=sc.nextInt();
		while(num>0)
		{
			digit=num%10;
			a=digit;
			num=num/10;

		}
	}
}
