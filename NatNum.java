// 2. WAP TO PRINT NATURAL NUMBERS FROM m TO n
import java.util.Scanner;
class NatNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int m,n;
		System.out.println("Enter starting range m ");
		m=sc.nextInt();
		System.out.println("Enter ending range n ");
		n=sc.nextInt();
		if((m!=0)&&(m<n))
		{
		System.out.println("The natural numbers from m to n are");
		for(int num=m;num<=n;num++)
		{
			System.out.println(num);
		}
		}
		else
		{
			System.out.println("Try again ");
		}
}
}
