package programming;

import java.util.Scanner;

public class ArmstrongSeries {
	
	public static int count(int n)
	{
		int c=0;
		while(n!=0)
			{
			c++;
			n=n/10;
			}return c;
		
	}
	public static boolean armstrongNumber(int n) {
		int d,s=0,temp=n;
		int c=count(n);
		while(n!=0)
		{
			d=n%10;
			int p=1;
			for(int i=1;i<=c;i++)
			{
				p=p*d;
			}
			s=s+p;
			n=n/10;
			
		}
		return temp==s ;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int m=sc.nextInt();
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		for(int i=m;i<=n;i++)
		{
			if(armstrongNumber(i))
			{
				System.out.println(i+ " is an armstrong number");
			}
			
		}
		
		
	}

}
