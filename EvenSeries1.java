// 5. WAP TO PRINT EVEN NUMBERS BETWEEN m TO n
import java.util.Scanner;
class EvenSeries1
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
		System.out.println("The even numbers between m to n are");
		for(int num=m+1;num<n;num++)
		
		{
			if(num%2==0)
			System.out.println(num);
		}
		}
		else
		{
			System.out.println("Try again ");
		}
}
}
