// 9. WAP TO COUNT THE NUMBER OF ODD NUMBERS BETWEEN m TO n
import java.util.Scanner;
class OddSeries2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int m,n;
		System.out.println("Enter starting range m ");
		m=sc.nextInt();
		System.out.println("Enter ending range n ");
		n=sc.nextInt();
		int count=0;
		if((m!=0)&&(m<n))
		{
		System.out.print("The number of odd numbers between m to n are:");
		for(int num=m+1;num<n;num++)
		
		{
			if(num%2!=0)
			count++;
		}

		}
		else
		{
			System.out.println("Try again ");
		}
		System.out.println(count);
}
}
